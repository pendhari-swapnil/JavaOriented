/**
 * 
 */
package com.example.demo.dto;

/**
 * @author HP
 *
 */
public class RegisterUserDto {
	
	private Integer empId; 
	
	private String email;
    
    private String password;
    
    private String userName;
    
    public RegisterUserDto() {
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

	/**
	 * @return the fullName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
    
    
    

}
