package com.shiva.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class WellNessException extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(UserExist.class)
	public ResponseEntity<ApiResponse> UserNotExist(UserExist exception)
	{
		ApiResponse response=ApiResponse.builder().message(exception.getMessage()).status(HttpStatus.NOT_FOUND)
				.timestamp(new Date()).build();
		
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
}
