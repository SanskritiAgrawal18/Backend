
package com.moneySutra.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.moneySutra.entity.Signup;

import com.moneySutra.repository.SignupRepository;



@Service
public class SignupService {
	
	@Autowired 
	SignupRepository signupRepository;
	
	public boolean saveSignup(Signup signup)
	{
	
		 
	   	 String fname =signup.getFname();
	   	String mname = signup.getMname();
	   	String lname = signup.getLname();
	   	String active = signup.getActive();
	   	String city = signup.getCity();
	   	String crestionDate = signup.getCreationDate();
	   	String email = signup.getEmail();
	   	String mobile = signup.getMobile();
	   	String pin = signup.getPin();
	   	String userRole = signup.getUserRole();
	   	
	   	
	   	signup.setFname(fname);
	   	signup.setMname(mname);
	   	signup.setLname(lname);
	   	signup.setActive(active);
	   	signup.setCity(city);
	   	signup.setCreationDate(crestionDate);
	   	signup.setMobile(mobile);
	   	signup.setUserRole(userRole);
	   	signup.setEmail(email);
	   	signup.setPin(pin);
	   	Signup result = signupRepository.save(signup);
	   	
	   	if(null != result) {
	        return true;
		}

		return false;
		}
		
	public Signup getUser(long id)
	{
		 Optional<Signup> signup = signupRepository.findById(id);
         if (signup.isPresent()) {
             return signup.get();
         }
         
         return null;
   
	}
//		public List<Personal> getPersonals() {
//			 List<Personal> allPersonals = (List<Personal>) personalRepository.findAll();
//			 return allPersonals;
//		}
//		public String deletePersonal(long id) {
//	    	 personalRepository.deleteById(id);
//	         return "Customer deleted successfully";
//	     }
//		
//		 public Personal updatePersonal(long id, Personal personal) {
//			 Optional<Personal> updatePersonal = personalRepository.findById(id);
//			 String fname = personal.getFname();
//			   	String mname = personal.getMname();
//			   	String lname = personal.getLname();
//			   	 String dob = personal.getDob();
//			   	 String gender = personal.getGender();	 
//			   	String marital = personal.getMarital();			 
//			   	String occu = personal.getOccu();	
//			   	 
//			   	personal.setId(id);
//			   	personal.setFname(fname);
//			   	personal.setMname(mname);
//			   	personal.setLname(lname);
//			   	personal.setDob(dob);
//			   	personal.setGender(gender);		 
//			   	personal.setMarital(marital);	
//			   	personal.setOccu(occu);	
//			   
//			 return personalRepository.save(personal);
//	     }
	}
