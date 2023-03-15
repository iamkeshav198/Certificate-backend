//package com.backend.backend.controller;
//
//import java.awt.PageAttributes.MediaType;
//import java.net.http.HttpHeaders;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/certificatesdown")
//public class CertificateController {
//    @GetMapping("/{name}")
//    public ResponseEntity<byte[]> getCertificate(@PathVariable String name) throws Exception {
//        byte[] certificateData = CertificateGenerator.generateCertificate(name);
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//        headers.setContentDisposition(ContentDisposition.attachment().filename(name + ".cer").build());
//        return new ResponseEntity<>(certificateData, headers, HttpStatus.OK);
//    }
//}
//
//
