# Equitas — Java Full-Stack Interview (2026-01-31)

- Candidate: gokulloganathn
- Role: Java Full-Stack
- Day: 001 (to be part of 100-days-of-coding series)

Below are the questions, concise answers, and code previews (full code files are included under day-001-equitas-2026-01-31/).

---

1) How do you authenticate the user in a Spring Boot API?

Answer (short):
- Use Spring Security to secure endpoints.
- Typical flow: user submits credentials to an authentication endpoint → server authenticates using a UserDetailsService + PasswordEncoder → on success the server returns a JWT access token → client includes the token in the Authorization header for subsequent requests → a OncePerRequestFilter validates the token and sets the SecurityContext.

Code preview (JwtUtil.java):

```java
package com.example.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

public class JwtUtil {
    private final String secret = "replace_with_strong_secret_here_change_me_please_!";
    private final long expirationMs = 1000L * 60 * 60; // 1 hour

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String generateToken(String username, Map<String, Object> claims) {
        Date now = new Date();
        return Jwts.builder()
                .setClaims(claims != null ? claims : new HashMap<>())
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(new Date(now.getTime() + expirationMs))
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    // ... other helper methods omitted for brevity (see day-001 folder)
}
```

2) What are the real-time use cases and where/how do you use tokens in Spring Boot?

Answer (real-world uses):
- Stateless authentication for REST APIs and microservices
- Mobile clients / SPAs: token-based auth decouples server-side sessions
- Authorization via claims/roles in token
- Microservice-to-microservice auth and signed URLs for temporary access (cloud storage)

3) What are methods in REST API?

Answer:
- GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS — with semantics (safe/idempotent) and best practices.

4) How do you build the API into a jar file?

Answer:
- With Maven: mvn clean package (spring-boot-maven-plugin produces executable jar)
- With Gradle: ./gradlew bootJar

5) What is use of GCP Cloud Storage bucket?

Answer:
- Object storage for images, backups, static assets, ETL staging, signed URLs, lifecycle rules, integration with Cloud Functions, etc.

Code preview (SignedUrlExample.java):

```java
package com.example.gcp;

import com.google.cloud.storage.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SignedUrlExample {
    public URL generateV4UploadSignedUrl(String bucketName, String objectName) {
        Storage storage = StorageOptions.getDefaultInstance().getService();
        BlobInfo blobInfo = BlobInfo.newBuilder(bucketName, objectName).build();

        URL signedUrl = storage.signUrl(blobInfo, 15, TimeUnit.MINUTES,
                Storage.SignUrlOption.httpMethod(HttpMethod.PUT),
                Storage.SignUrlOption.withV4Signature());
        return signedUrl;
    }
}
```

Additional questions (not asked):

Q) What is JWT token?

Answer:
- JWT (JSON Web Token) is a compact, URL-safe token with three parts (header.payload.signature). Claims include iss, sub, exp, iat, and custom claims. JWTs are useful for stateless authentication but must be validated for signature, issuer, audience, and expiry. Avoid sensitive data in payload unless encrypted.

---

Notes & next steps:
- Files added under day-001-equitas-2026-01-31/ include full source files and a minimal pom.xml.
- This day entry will be the first in your 100-days-of-coding series; future days can follow the same folder pattern.
