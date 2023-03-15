package com.backend.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backend.entities.Certificate;
import com.backend.backend.services.CertificateService;

@RestController
@CrossOrigin("*")
//@RequestMapping("/user")
public class MyController {
	
	@Autowired
	private CertificateService certificateservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to the Dashboard  ";
	}
	
	@GetMapping("/certificates")
	public List<Certificate> getCertificate(){
		
		return this.certificateservice.getCertificates();
		
	}
	
	@GetMapping("/certificates/{ein}")
	public Certificate getCertificate(@PathVariable String ein) {
		return this.certificateservice.getCertificate(Integer.parseInt(ein));
	}
	
	// add certificates
	@PostMapping(path="/certificates", consumes = "application/json")
	public Certificate addCertificate(@RequestBody Certificate certificate) {
		
		return this.certificateservice.addCertificate(certificate);
		
	}
	
	//update certificate
	@PutMapping("/certificates")
	public Certificate updateCertificate(@RequestBody Certificate certificate) {
		return this.certificateservice.updateCertificate(certificate);
	}

}
