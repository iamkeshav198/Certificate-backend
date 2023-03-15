//package com.backend.backend.controller;
//
//import java.io.ByteArrayOutputStream;
//import java.io.FileInputStream;
//import java.security.Key;
//import java.security.KeyStore;
//import java.security.cert.X509Certificate;
//
//public class CertificateGenerator {
//    public static byte[] generateCertificate(String name) throws Exception {
//        // Use Java keytool to generate a certificate based on the given name
//        Process process = Runtime.getRuntime().exec("keytool -genkeypair -alias " + name + " -keyalg RSA -keystore cert.keystore -storepass password -keypass password -dname \"CN=" + name + "\"");
//        process.waitFor();
//
//        // Load the generated certificate from the keystore
//        KeyStore keystore = KeyStore.getInstance("JKS");
//        keystore.load(new FileInputStream("cert.keystore"), "password".toCharArray());
//        Key key = keystore.getKey(name, "password".toCharArray());
//        X509Certificate cert = (X509Certificate) keystore.getCertificate(name);
//
//        // Export the certificate as a byte array
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        outputStream.write(cert.getEncoded());
//        outputStream.write(key.getEncoded());
//        return outputStream.toByteArray();
//    }
//}
//
