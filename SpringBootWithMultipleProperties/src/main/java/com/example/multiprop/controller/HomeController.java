/**
 * 
 */
package com.example.multiprop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multiprop.config.ApplicationConfiguration;

//import com.example.multiprop.config.ApplicationConfiguration;

/**
 * @author HP
 *
 */
@RestController
@RequestMapping("/demo")

public class HomeController {
	
	
	@Autowired
	private ApplicationConfiguration app;

	@Value("${app.title}") // Injecting the value of app.greeting fron application.properties 
	 private String title;

	// First Way to inject propeerty from application properties file
	@Value("${spring.application.name}")
	private String greeting;

	@GetMapping("/hello")
	public ResponseEntity<String> getMessage() {
		String s = "Property Read Successfully !";
		// return new ResponseEntity<String>(s, HttpStatus.OK);
		 System.out.println("properties--" + greeting );
		 System.out.println("properties--" + title );
		return ResponseEntity.ok(s);
	}

}
