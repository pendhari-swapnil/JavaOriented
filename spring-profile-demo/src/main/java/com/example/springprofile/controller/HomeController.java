/**
 * 
 */
package com.example.springprofile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@GetMapping("/checkProp")
	public void printDatabaseProp() {
		
		System.out.println("username--" + username);
		System.out.println("url=====" + url);
	}

}
