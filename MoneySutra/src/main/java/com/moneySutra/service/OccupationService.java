package com.moneySutra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneySutra.entity.Occupation;

import com.moneySutra.repository.OccupationRepository;



@Service
public class OccupationService {
	
	@Autowired 
	OccupationRepository occupationRepository;
	
	public List<Occupation> getOccupations() {
		 List<Occupation> allOccupations = (List<Occupation>) occupationRepository.findAll();
		 return allOccupations;
	}
	}
