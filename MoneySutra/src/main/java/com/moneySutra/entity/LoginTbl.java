package com.moneySutra.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
public class LoginTbl {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String mpin;

    private String email;
    
    private String mobile;

    private String active = "Y";

    

    public LoginTbl() {
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



	public String getMpin() {
		return mpin;
	}



	public void setMpin(String mpin) {
		this.mpin = mpin;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getActive() {
		return active;
	}



	public void setActive(String active) {
		this.active = active;
	}



	public LoginTbl(Long id, String userName, String mpin, String email, String mobile, String active) {
		super();
		this.id = id;
		this.userName = userName;
		this.mpin = mpin;
		this.email = email;
		this.mobile = mobile;
		this.active = active;
	}



	@Override
	public String toString() {
		return "LoginTbl [id=" + id + ", userName=" + userName + ", mpin=" + mpin + ", email=" + email + ", mobile="
				+ mobile + ", active=" + active + "]";
	}

    

    
}
