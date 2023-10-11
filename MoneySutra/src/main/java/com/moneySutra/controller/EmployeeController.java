package com.moneySutra.controller;

import com.moneySutra.entity.Employee;
import com.moneySutra.entity.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.moneySutra.repository.EmployeeRepository;
import com.moneySutra.repository.LoginRepository;

import java.util.List;
import java.util.Optional;

    @RestController
    public class EmployeeController {

        @Autowired
        private EmployeeRepository employeeRepository;
        @Autowired
        private LoginRepository loginRepository;

        

        @PostMapping("/employee")
        public Employee saveEmployee(@RequestBody Employee employee) {
            return employeeRepository.save(employee);
        }

        @GetMapping("/employee")
        public List<Employee> getAllEmployees() {
            List<Employee> allEmployees = (List<Employee>) employeeRepository.findAll();
            return allEmployees;
        }

        @GetMapping("/employee/{id}")
        public Employee getEmployeeById(@PathVariable("id") Long id) {
            Optional<Employee> employee = employeeRepository.findById(id);
            if (employee.isPresent()) {
                return employee.get();
            }
            return null;
        }

        @PutMapping("/employee/{id}")
        public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {

            return employeeRepository.save(employee);
        }

        @DeleteMapping("/employee/{id}")
        public String deleteEmployee(@PathVariable("id") Long id) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        
        @GetMapping("/checkLogin/{username}/{password}")
        public Boolean checkLogin(@PathVariable("username") String username, @PathVariable("password") String password) {
            Optional<Login> login = loginRepository.findEmployeeByUserNameAndPassword(username, password);
        	
        	System.out.println(login.isPresent());
        	
            //Optional<Login> login = loginRepository.findLoginByUserNameAndPassAndActive(username, password, "Y");
            
        	Optional<Login> login1 = loginRepository.findLoginByUserName(username);
        	
            if (login1.isPresent()) {
//                return login.get();
//            		return login.get().getUserName();
            	return true;
            }
            return false;
        }

        
    }

