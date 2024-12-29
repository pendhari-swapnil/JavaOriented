/**
 * 
 */
package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author HP  https://www.javainuse.com/spring/boot-exception-handling
 *
 */
@ControllerAdvice
public class GlobalExceptionController {
	
	@ExceptionHandler(DataNotAvailableException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse  handleDataNotAvailable(final DataNotAvailableException exception, final HttpServletRequest request){
		
		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMsg(exception.getMessage());
		error.callerURL(request.getRequestURI());

		return error;
	}
	
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final Exception exception,
			final HttpServletRequest request) {

		ExceptionResponse error = new ExceptionResponse();
		error.setErrorMsg(exception.getMessage());
		error.callerURL(request.getRequestURI());
		return error;
	}
}
