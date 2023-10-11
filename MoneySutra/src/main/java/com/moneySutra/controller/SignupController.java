package com.moneySutra.controller;


import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.moneySutra.repository.SignupRepository;

import com.moneySutra.entity.Personal;
import com.moneySutra.entity.Signup;

import com.moneySutra.service.SignupService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

   
@CrossOrigin(origins = "*")
@RestController
public class SignupController {

	 @Autowired
	 private SignupService signupService;
	 
	
	 @PostMapping(
		        value = "/signup",
		        produces = "application/json")
		    public String postBody(@RequestBody Signup signup) {
		 
		 boolean res= signupService.saveSignup(signup);
		        return String.valueOf(res);
		    }
	 
	  @RequestMapping(path = "/signup", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
	  public ResponseEntity<Boolean> createNewProject(Signup signup){
	        Boolean project = signupService.saveSignup(signup);
	     

	        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	    }
	  @GetMapping("/signup/{id}")
	  public Signup getSignupById(@PathVariable("id") Long id) {
	        
	    	 return signupService.getUser(id);
	    	 
	        
	     }
	     
     
//     
//     @PutMapping("/Signup")
//     public Personal updatePersonal(@RequestParam("id") Long id, @RequestBody Personal personal) {
//
//    	 return personalService.updatePersonal(id, personal);
//     }

//     
//     @DeleteMapping("/deleteCustomer")
//     public String deletePersonal(@RequestParam("id") Long id) {
//    	 
//         return personalService.deletePersonal(id);
//     }
}

