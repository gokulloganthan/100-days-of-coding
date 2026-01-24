# Interview Questions and Answers

## Company: taff

### 1. What is the difference between method overloading and overriding?

- **Method Overloading:** This is when multiple methods in the same class have the same name but different parameters (different type, number, or both).
- **Method Overriding:** This occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass. The method in the subclass provides a specific implemen[...]

### 2. Is Java String mutable or immutable?

- **Immutable:** Java Strings are immutable, meaning that once a String object is created, its value cannot be changed. Any modification to a String results in the creation of a new String object.

### 3. Which String method do you prefer when you are working with threads?

- When working with threads, it’s preferred to use `StringBuffer` or `StringBuilder`. `StringBuffer` is synchronized and thus thread-safe, whereas `StringBuilder` is not synchronized but can be used[...]

### 4. What is middleware and Node.js? How are they both interlinked?

- **Middleware:** Middleware refers to software that acts as an intermediary, enabling communication and data management for distributed applications. It handles tasks such as authentication, logging,[...]
- **Node.js:** Node.js is a runtime environment that allows developers to execute JavaScript code server-side. It's known for its non-blocking, event-driven architecture.
- **Interlink:** Middleware in Node.js is often used in web frameworks like Express.js, where middleware functions can intercept requests, process them, and pass them on to the next middleware or rout[...]

## Coding Questions in JavaScript

### 1. Sort the employee name and place based on place

```javascript
let employees = [
  { name: 'John', place: 'New York' },
  { name: 'Jane', place: 'California' },
  { name: 'Doe', place: 'New York' },
  { name: 'Smith', place: 'Florida' }
];

employees.sort((a, b) => a.place.localeCompare(b.place));

console.log(employees);

```

## Interview experience

- Platform Science — 2026-01-23

  Summary:
  - Interviewed for a backend role. The interview covered SQL, Java/Spring concepts, authentication/authorization, OAuth2/JWT, and a live coding task using streams.

  Questions asked and my responses:
  1. Have you used SQL?
     - Asked about past experience using SQL and relational databases.
     - My response: Yes — described projects where I used SQL for data modeling and queries.

  2. What is the purpose of the flush() method?
     - Asked about flush() (likely in the context of JPA/Hibernate or I/O streams).
     - My response: Explained that flush() forces the persistence context to synchronize with the database (in JPA/Hibernate) and that in I/O it forces buffered data to be written out.

  3. How do you authenticate and authorize a user?
     - They asked me to explain the login process from frontend to backend.
     - My response: I gave a high-level overview of authentication and authorization flows (login request, credential validation, session/JWT issuance, access control).
     - Interviewer expectation: They wanted a deeper, step-by-step internal walkthrough (exact request/response payloads, token lifecycles, storage, session vs stateless tokens, refresh tokens, token revocation, and how middleware/filters enforce authorization).

  4. How does OAuth2 authenticate the user?
     - I mentioned mechanisms like token issuance and JWTs.
     - Correction/clarification: OAuth2 is an authorization framework that issues access (and optionally ID) tokens after user consent; OpenID Connect (OIDC) builds identity on top of OAuth2 and commonly uses ID tokens (often JWTs). Encryption and signing (JWS/JWE) are used to protect/verify tokens depending on configuration.

  5. Live coding: Use streams to count the number of letters in a string
     - Task: Implement a solution using streams (likely Java Stream API).
     - Gap: I struggled with autocompletion and typing in the online coding environment which slowed me down while writing the solution from scratch.

  Final feedback from HR:
  - Improve integration of SQL with Spring using Hibernate (practical experience with entity mappings, transactions, repositories).
  - Deepen understanding of authentication internals (OAuth2/OIDC flows, JWT structure and validation, refresh token handling, secure storage and revocation strategies).

  Takeaways / action items:
  - Practice hands-on projects that integrate Spring Boot with a relational database using Hibernate (entities, JPQL, Criteria API, transaction management).
  - Study authentication and authorization in depth:
    - Understand the OAuth2 flows (authorization code, client credentials, refresh tokens).
    - Learn OpenID Connect basics and how ID tokens differ from access tokens.
    - Practice implementing JWT creation, signing, validation, expiry, and refresh flows.
    - Learn best practices for token storage, revocation, and secure transmission.
  - Do timed live-coding exercises in online editors to get comfortable with typing and autocompletion constraints.
