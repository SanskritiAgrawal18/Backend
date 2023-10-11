package com.moneySutra.repository;


import com.moneySutra.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


 @Repository
 public interface TestRepository  extends CrudRepository<Test, Long> {

}
