/**
 * 
 */
package com.example.demo.service;
import com.example.demo.dto.RegisterUserDto;
import com.example.demo.domain.User;
import com.example.demo.dto.UserLoginDto;

/**
 * @author HP
 *
 */
public interface AuthenticationService {
	
	public User register(RegisterUserDto dto);
	
	public User authenticate(UserLoginDto dto);
}
