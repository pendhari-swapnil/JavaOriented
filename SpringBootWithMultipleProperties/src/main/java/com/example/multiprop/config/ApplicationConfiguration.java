package com.example.multiprop.config;
  
import org.springframework.beans.factory.annotation.Value; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.PropertySource;
  
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

	@Value("${file.ext}")
	private String fileExt;

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}

}
		 