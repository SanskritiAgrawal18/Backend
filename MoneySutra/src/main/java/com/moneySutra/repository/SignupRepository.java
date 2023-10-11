package com.moneySutra.repository;

import com.moneySutra.entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


 @Repository
 public interface SignupRepository extends CrudRepository<Signup, Long> {

}
