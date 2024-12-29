/**
 * 
 */
package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JWTTokenUtil;
import com.example.demo.model.JwtRequest;
import com.example.demo.model.JwtResponse;
import com.example.demo.serviceimpl.JwtUserDetailsService;

/**
 * @author HP
 *
 */
@RestController
@CrossOrigin
public class JwtAuthenticationController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloRestContoller.class);
	@Autowired
	private  JwtUserDetailsService jwtUserDetailsService;
	
	@Autowired
	private  AuthenticationManager authenticationManager;
	
	@Autowired
	private  JWTTokenUtil jwtTokenUtil;
	
	@PostMapping(value="/authenticate")
	public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authenticationRequest){
		logger.info("Enter JwtAuthenticationController createAuthToken");
		
		authenticate(authenticationRequest.getUserName(), authenticationRequest.getPassword() );
		final UserDetails ud = jwtUserDetailsService.loadUserByUsername(authenticationRequest.getUserName());
		final String token = jwtTokenUtil.generateToken(ud);
		logger.info("Exit JwtAuthenticationController createAuthToken");
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
	private void authenticate(String userName, String Password) {
		logger.info("Enter JwtAuthenticationController authenticate");
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, Password));
		}catch(BadCredentialsException ex) {
			throw new BadCredentialsException("INVALID_CREDENTIALS", ex);
		}
		catch(Exception e) {
			//throw new Exception("INVALID_CREDENTIALS", e);
			e.printStackTrace();
		}
		logger.info("Enter JwtAuthenticationController authenticate");
	}

}
