/**
 * 
 */
package com.example.demo.model;

import java.io.Serializable;

/**
 * @author HP
 *
 */
public class JwtResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String jwtToken;
	
	public JwtResponse(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
	
	public String getToken() {
		return this.jwtToken;
	}
}
