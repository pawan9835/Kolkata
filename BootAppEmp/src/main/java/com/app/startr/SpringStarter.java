package com.app.startr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.EmpModel;

@SpringBootApplication
public class SpringStarter {

	
   public static void main(String[] args) {
	
	   
	   
	   SpringApplication.run(EmpModel.class, args);
}
}
