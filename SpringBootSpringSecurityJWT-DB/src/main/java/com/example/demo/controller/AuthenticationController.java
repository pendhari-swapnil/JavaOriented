/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.dto.RegisterUserDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.AuthenticationService;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.response.LoginResponse;
import com.example.demo.security.config.JwtTokenService;
/**
 * @author HP
 *
 */
@RequestMapping(value = "/auth")
@RestController
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private JwtTokenService jwtTokenService;
	
	@PostMapping("/singIn")
	public ResponseEntity<RegisterUserDto> register(@RequestBody RegisterUserDto registerUserDto){
		RegisterUserDto dto = new RegisterUserDto();
		try {
			User user = authenticationService.register(registerUserDto);
			dto = modelMapper.map(user, RegisterUserDto.class);
		}catch(Exception ex) {
			ex.getMessage().toString();
		}
		return new ResponseEntity<RegisterUserDto>(dto, HttpStatus.CREATED);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<LoginResponse> authenticate(@RequestBody UserLoginDto userLoginDto){
		LoginResponse loginResponse =  new LoginResponse();
		try {
			User authenticatedUser = authenticationService.authenticate(userLoginDto);
			String jwtToken = jwtTokenService.generateToken(authenticatedUser);
			loginResponse = new LoginResponse();
			loginResponse.setToken(jwtToken);
			loginResponse.setExpiresIn(jwtTokenService.getExpirationTime());
			
		}catch(BadCredentialsException ex) {
			throw new BadCredentialsException("INVALID_CREDENTIALS", ex);
		}
		catch(Exception ex) {
			
		}
		return ResponseEntity.ok(loginResponse); 
	}
	

}
