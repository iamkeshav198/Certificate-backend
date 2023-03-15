package com.backend.backend.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.backend.backend.entities.Certificate;

public interface CertificateService {
	
	public List<Certificate> getCertificates();
	
	public Certificate getCertificate(int ein);
	
	public Certificate addCertificate(Certificate certificate);
	
	public Certificate updateCertificate(Certificate certificate);
	
	public void deleteCertificate(Integer parseInteger);

}
