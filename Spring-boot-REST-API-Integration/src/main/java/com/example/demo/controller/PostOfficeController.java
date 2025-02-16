/**
 * 
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.PostOfficeResponse;
import com.example.demo.service.PostOfficeService;

/**
 * @author HP
 *
 */
@RestController
@RequestMapping(value = "/postDetails")
public class PostOfficeController {
	
	Logger log = LoggerFactory.getLogger(PostOfficeController.class);
	
	@Autowired
	private PostOfficeService postOfficeService;
	
	@Value("${api.postOffice.url}")
	private String postUrl;
	
	@GetMapping(value = "/getDetails")
	public ResponseEntity<PostOfficeResponse> getPostDetailsByPincode(
			@RequestParam(name = "pinCode", required = true) String pinCode) {
		PostOfficeResponse response = null;
		try {
			if(pinCode != null && pinCode.length() >0) {
				 response = postOfficeService.getPostDetailsByPincode(pinCode,postUrl );
			}
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
