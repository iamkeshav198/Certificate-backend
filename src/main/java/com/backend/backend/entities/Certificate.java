package com.backend.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	
	@Override
	public String toString() {
		return "Certificate [ein=" + ein + ", name=" + name + ", duration=" + duration + ", Dept=" + Dept + ", email="
				+ email + ", tr_name=" + tr_name + "]";
	}
	public int getEin() {
		return ein;
	}
	public void setEin(int ein) {
		this.ein = ein;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTr_name() {
		return tr_name;
	}
	public void setTr_name(String tr_name) {
		this.tr_name = tr_name;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(int ein, String name, int duration, String dept, String email, String tr_name) {
		super();
		this.ein = ein;
		this.name = name;
		this.duration = duration;
		Dept = dept;
		this.email = email;
		this.tr_name = tr_name;
	}
	
	@Id
	private int ein;
	private String name;
	private int duration;
	private String Dept;
	private String email;
	private String tr_name;
	

}
