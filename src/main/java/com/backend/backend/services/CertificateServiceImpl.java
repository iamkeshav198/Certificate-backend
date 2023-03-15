 package com.backend.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backend.dao.CertificateDao;
import com.backend.backend.entities.Certificate;

@Service
public class CertificateServiceImpl implements CertificateService{

	List<Certificate> list;
	
	@Autowired
	private CertificateDao certificatedao;
	
	public CertificateServiceImpl() {
		list = new ArrayList<>();
		list.add(new Certificate(001,"Keshav Gupta",600,"IT","iamkeshav198@gmail.com","JAVA Training"));
		list.add(new Certificate(002,"Ashu Gupta",600,"YNA","iamashu@gmail.com","Python Training"));
	}
	
	@Override
	public List<Certificate> getCertificates() {
		// TODO Auto-generated method stub
		return certificatedao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Certificate getCertificate(int ein) {
		// TODO Auto-generated method stub
//		Certificate c = null;
//		for(Certificate certificate : list) {
//			if(certificate.getEin() == ein) {
//				c = certificate;
//				break;
//			}
//			
//		}
		
		return certificatedao.getOne(ein);
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		certificatedao.save(certificate);
		
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
//		list.forEach(e->{
//			if(e.getEin()==certificate.getEin()) {
//				e.setName(certificate.getName());
//				e.setDept(certificate.getDept());
//				e.setDuration(certificate.getDuration());
//				e.setEmail(certificate.getEmail());
//				e.setTr_name(certificate.getTr_name());
//			}
//		});
		certificatedao.save(certificate);
		return certificate;
	}
	
	public void deleteCertificate(Integer parseInteger) {
		Certificate entity = certificatedao.getOne(parseInteger);
		certificatedao.delete(entity);
	}

}   
