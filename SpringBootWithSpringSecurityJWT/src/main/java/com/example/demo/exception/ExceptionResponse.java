/**
 * 
 */
package com.example.demo.exception;

/**
 * @author HP
 *
 */
public class ExceptionResponse {

	private String errorMsg;
	private String requestURL;
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getRequestURL() {
		return requestURL;
	}
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public void callerURL(final String  requestURL) {
		this.requestURL = requestURL;	
	}
	
}
