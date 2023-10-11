package com.moneySutra.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.moneySutra.entity.BrokerMaster;

import com.moneySutra.repository.BrokerMasterRepository;



@Service
public class BrokerMasterService {
	
	@Autowired 
	BrokerMasterRepository brokerMasterRepository;
	
		public List<BrokerMaster> getBrokerMasters() {
			 List<BrokerMaster> allBrokerMasters = (List<BrokerMaster>) brokerMasterRepository.findAll();
			 return allBrokerMasters;
		}
		
		
	}
