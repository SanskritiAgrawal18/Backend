package com.moneySutra.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
public class Login {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String pass;

    private String active;

    public Login() {
    }

    
	public Login(Long id, String userName, String password, String active) {
		super();
		this.id = id;
		this.userName = userName;
		this.pass = password;
		this.active = active;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return pass;
	}

	public void setPassword(String password) {
		this.pass = password;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

    
}
