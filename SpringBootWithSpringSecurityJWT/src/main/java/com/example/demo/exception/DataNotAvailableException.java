/**
 * 
 */
package com.example.demo.exception;

/**
 * @author HP
 *
 */
public class DataNotAvailableException extends Exception{
	
	 private static final long serialVersionUID = 1L;
	 
	 public DataNotAvailableException() {
		 super();
	 }
	 public DataNotAvailableException(final String message) {
		 super(message);
	 }

}
