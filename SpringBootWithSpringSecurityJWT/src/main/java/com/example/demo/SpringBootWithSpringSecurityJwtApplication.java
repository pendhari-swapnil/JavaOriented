package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://medium.com/javarevisited/springboot-security-with-jwt-fca1446790ba

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.HelloRestContoller;
//@Configuration
@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootWithSpringSecurityJwtApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloRestContoller.class);

	public static void main(String[] args) {
		logger.debug("Inside SpringBootWithSpringSecurityJwtApplication...... ");
		SpringApplication.run(SpringBootWithSpringSecurityJwtApplication.class, args);
	}

}
       