package com.moneySutra.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.moneySutra.entity.Login;
import com.moneySutra.entity.LoginTbl;


    @Repository
//    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        public interface LoginTblRepository extends CrudRepository<LoginTbl, Long> {
    	
//    	  @Query(nativeQuery = true, value = "SELECT * FROM login where active='Y' and username=?1 and pass=?2")
//    	  Optional<Login> findEmployeeByUserNameAndPassword(String username, String password);
//    	  
//    	  
//    	  
//    	  Optional<Login> findLoginByUserName(String username);// select * from login where username= 'manoj'
//    	  
//    	  
    	  Optional<LoginTbl> findLoginTblByEmailAndMpinAndActive(String email, String mpin, String Active);

    	  Optional<LoginTbl> findLoginTblByMobileAndMpinAndActive(String mobile, String mpin, String Active);

    }

