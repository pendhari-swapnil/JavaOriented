package com.example.springprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringProfileDemoApplication {
	
	@Autowired
    private Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProfileDemoApplication.class, args);
	}
	
	public void getActiveProfile() {
		for(String proName : environment.getActiveProfiles() ) {
			System.out.println("Currently active profile - " + proName);
		}
	}
}
