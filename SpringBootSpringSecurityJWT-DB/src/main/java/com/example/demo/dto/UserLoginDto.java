/**
 * 
 */
package com.example.demo.dto;

/**
 * @author HP
 *
 */
public class UserLoginDto {
	
	
	  private String email;
	    
	   private String password;
	   
	   public UserLoginDto() {
		   super();
	   }

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	   
	   
	
}
