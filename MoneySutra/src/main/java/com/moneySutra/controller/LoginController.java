package com.moneySutra.controller;

import com.moneySutra.entity.LoginTbl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.moneySutra.repository.LoginTblRepository;

import java.util.Optional;

@CrossOrigin(origins = "*")
    @RestController
    public class LoginController {

       
        @Autowired
        private LoginTblRepository loginRepository;

        

        @PostMapping(
		        value = "/doLogin",
		        produces = MediaType.APPLICATION_JSON_VALUE,
		        consumes = MediaType.APPLICATION_JSON_VALUE
        		)
        public @ResponseBody boolean doLogin(@RequestBody LoginTbl login) {
        	
        	System.out.println(login.getEmail()+login.getMpin()+login.getActive());
        	
        	Optional<LoginTbl> loginTblResponse = null;
        	if(login.getEmail() != null)
        	{
        		loginTblResponse = loginRepository.findLoginTblByEmailAndMpinAndActive(login.getEmail(), login.getMpin(), login.getActive());
        	}
        	else if(login.getMobile() != null)
        	{
        		loginTblResponse = loginRepository.findLoginTblByMobileAndMpinAndActive(login.getMobile(), login.getMpin(), login.getActive());
            	
        	}
        	
        	 if (loginTblResponse.isPresent()) {
        		 System.out.println( loginTblResponse.get());
             }
            return loginTblResponse.isPresent();
        }
        
    }

