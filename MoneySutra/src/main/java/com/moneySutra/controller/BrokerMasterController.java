package com.moneySutra.controller;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.moneySutra.repository.BrokerMasterRepository;
import com.moneySutra.entity.BrokerMaster;

import com.moneySutra.service.BrokerMasterService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

   
@CrossOrigin(origins = "*")
@RestController
public class BrokerMasterController {

	 @Autowired
	 private BrokerMasterService brokerMasterService;
	 
	

	  @GetMapping("/brokermaster")
	     public List<BrokerMaster> getAllBrokerMasters() {
	    	 return brokerMasterService.getBrokerMasters();
	     }


}

