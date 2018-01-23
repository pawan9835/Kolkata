package com.app.control;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class EMpControl {

	@RequestMapping("/hello")
	public String sowPage(){
		

		return "Hi  ";
	}
}
