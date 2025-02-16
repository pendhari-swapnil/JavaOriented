/**
 * 
 */
package com.example.demo.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.controller.PostOfficeController;
import com.example.demo.response.PostOfficeBean;
import com.example.demo.response.PostOfficeResponse;
import com.example.demo.service.PostOfficeService;

/**
 * @author HP
 *
 */
@Service
public class PostOfficeServiceImpl implements PostOfficeService{
	
	Logger log = LoggerFactory.getLogger(PostOfficeServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@Override
	public PostOfficeResponse getPostDetailsByPincode(String pinCode,String postUrl) {
		PostOfficeResponse[] resp = null;
		try {
			if( postUrl != null && postUrl.length() > 0 ) {
				postUrl = postUrl.replace("{pinCode}", pinCode);
				ResponseEntity<PostOfficeResponse[]> response= restTemplate.getForEntity(postUrl, PostOfficeResponse[].class);
				 resp = response.getBody();
			}
			
		}catch(Exception exception) {
			exception.getMessage().toString();
		}
		return resp[0];
	}

}
