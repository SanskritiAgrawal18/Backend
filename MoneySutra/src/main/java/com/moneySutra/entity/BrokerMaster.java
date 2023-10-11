package com.moneySutra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

@Entity
public class BrokerMaster {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

	
    private String brokerName;
	
    private String brokerId;
    private String active;
  

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getBrokerId() {
		return brokerId;
	}

	public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public BrokerMaster(Long id, String brokerName, String brokerId, String active) {
		super();
		this.id = id;
		this.brokerName = brokerName;
		this.brokerId = brokerId;
		this.active = active;
	}

	
	public BrokerMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

}




