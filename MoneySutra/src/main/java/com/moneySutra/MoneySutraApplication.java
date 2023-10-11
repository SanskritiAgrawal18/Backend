package com.moneySutra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.moneySutra.entity.Student;

@SpringBootApplication
public class MoneySutraApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneySutraApplication.class, args);
        
        
        Student shreya = new Student();
        
        boolean isSuccess = shreya.setAge(-10);
        System.out.println("is Inserted==="+ isSuccess);
        Student shanski = new Student();
        
        shreya.showName();
        shanski.showName();
        
    }
    
}
