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