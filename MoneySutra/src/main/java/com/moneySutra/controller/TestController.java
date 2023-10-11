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
import com.moneySutra.repository.TestRepository;
import com.moneySutra.entity.Test;

import com.moneySutra.service.TestService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

   
@CrossOrigin(origins = "*")
@RestController
public class TestController {

	 @Autowired
	 private TestService testService;

	 @GetMapping("/test")
	     public List<Test> getAllTests() {
	    	 return testService.getTests();
	     }

	 @GetMapping("/test/{id}")
     public Test getTestById(@PathVariable("id") Long id) {
        
    	 return testService.getCustomerById(id);
     }
     
     
     @PutMapping("/test/{id}")
     public Test updateTest(@PathVariable("id") Long id, @RequestBody Test test) {

    	 return testService.updateTest(id, test);
     }

     
}
