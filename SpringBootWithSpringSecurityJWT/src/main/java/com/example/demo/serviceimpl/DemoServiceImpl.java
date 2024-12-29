/**
 * 
 */
package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.IDemoService;

/**
 * @author HP
 *
 */
@Service
public class DemoServiceImpl implements IDemoService {

	@Override
	public String saySomething() {
		// TODO Auto-generated method stub
		
		return new String("Hello");
		
	}

	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean validateUser(String userName) {
		// TODO Auto-generated method stub
		System.out.println("User Name is--------" + userName);
		
		
		return null;
	}

}
