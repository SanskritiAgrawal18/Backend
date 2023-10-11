package com.moneySutra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

@Entity
public class Signup {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

	
    private String fname;
	
    private String mname;
    private String lname;
    private String mobile;
	
	
    private String email;
    
    private String pin;
    
    private String city;
    private String userRole;
    private String creationDate;
    private String active;
    
    
	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public Signup(Long id, String fname, String mname, String lname, String mobile, String email, String pin,
			String city, String userRole, String creationDate, String active) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.pin = pin;
		this.city = city;
		this.userRole = userRole;
		this.creationDate = creationDate;
		this.active = active;
	}

	
	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}


}




