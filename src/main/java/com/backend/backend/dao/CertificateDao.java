package com.backend.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.backend.entities.Certificate;

public interface CertificateDao extends JpaRepository<Certificate , Integer > {
	
	
}
