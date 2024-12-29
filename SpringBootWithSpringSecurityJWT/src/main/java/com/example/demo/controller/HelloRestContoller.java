/**
 * 
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DataNotAvailableException;
import com.example.demo.service.IDemoService;

/**
 * @author HP  https://medium.com/@aedemirsen/spring-boot-global-exception-handler-842d7143cf2a
 *
 */
@RestController
@RequestMapping("/hello")
public class HelloRestContoller {
	private static final Logger logger = LoggerFactory.getLogger(HelloRestContoller.class);
	@Autowired
	private  IDemoService iDemoService;
	
	
	@GetMapping("/user")
	public String sayUser() {
		logger.debug("inside HelloRestContoller method");
		try {
			throw new DataNotAvailableException("Internal server error while gettting user data!");
		}catch (Exception e) {
			e.getMessage().toString();
		}
		logger.debug("inside HelloRestContoller method");
		return "Hello .....Hi....User";
	}
	
	@GetMapping("/admin")
	public String sayAdmin() {
		return "Helllo....Hi.....Admin";
	}
	
	@GetMapping("/validateUser")
	public ResponseEntity<Object> validatedUser(@RequestParam(name="userName") String userName){
			Boolean isUserValidated = iDemoService.validateUser(userName);
		return ResponseEntity.ok("User Validated");
	}
	
}
