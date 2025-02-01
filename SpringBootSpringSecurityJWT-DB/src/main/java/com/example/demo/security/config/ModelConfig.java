/**
 * 
 */
package com.example.demo.security.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HP
 *
 */
@Configuration
public class ModelConfig {
	
	@Bean
	public ModelMapper modelMapper() {
	 return new ModelMapper();
	}
	
}
