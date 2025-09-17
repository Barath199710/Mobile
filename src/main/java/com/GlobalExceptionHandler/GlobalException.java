package com.GlobalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
 

	@RestControllerAdvice 
	public class GlobalException { 
		@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object>rest(NameNotFoundException e)
	{
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.ALREADY_REPORTED);
	} 
		@ExceptionHandler(AgeNotFoundException.class)
		public ResponseEntity<Object>rest(AgeNotFoundException s){
			return new ResponseEntity<Object>(s.getMessage(),HttpStatus.ALREADY_REPORTED);
		}
	}

