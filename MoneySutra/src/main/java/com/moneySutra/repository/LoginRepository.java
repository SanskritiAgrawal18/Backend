package com.moneySutra.repository;

import com.moneySutra.entity.Login;
import com.moneySutra.entity.LoginTbl;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


    @Repository
//    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        public interface LoginRepository extends CrudRepository<LoginTbl, Long> {
    	
    	  @Query(nativeQuery = true, value = "SELECT * FROM login where active='Y' and username=?1 and pass=?2")
    	  Optional<Login> findEmployeeByUserNameAndPassword(String username, String password);
    	  
    	  
    	  
    	  Optional<Login> findLoginByUserName(String username);// select * from login where username= 'manoj'

    }

