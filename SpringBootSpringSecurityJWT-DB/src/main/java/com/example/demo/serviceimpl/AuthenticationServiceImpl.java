/**
 * 
 */
package com.example.demo.serviceimpl;

import com.example.demo.service.AuthenticationService;
import com.example.demo.domain.User;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.RegisterUserDto;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.repository.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
/**
 * @author HP
 *
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private  AuthenticationManager authenticationManager;
	
	@Override
	public User register(RegisterUserDto dto) {
		User user = null;
		try {
			 user = userRepository.save(modelMapper.map(dto, User.class));
			
		}catch(Exception ex) {
			ex.getMessage().toString();
		}
		return user;
	}

	@Override
	public User authenticate(UserLoginDto dto) {
		try {
		Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword())
					);
		}catch(Exception ex) {
			ex.getMessage().toString();
		}
		return null;
	}

}
