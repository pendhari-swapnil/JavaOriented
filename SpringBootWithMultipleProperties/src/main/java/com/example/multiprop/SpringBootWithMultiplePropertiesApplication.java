package com.example.multiprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
//@EnableAutoConfiguration

public class SpringBootWithMultiplePropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMultiplePropertiesApplication.class, args);
	}
	
	

}
