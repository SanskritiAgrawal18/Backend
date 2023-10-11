package com.moneySutra.repository;

import com.moneySutra.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


    @Repository
//    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    }

