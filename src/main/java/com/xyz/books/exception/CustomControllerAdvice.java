package com.xyz.books.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomControllerAdvice {

	@ExceptionHandler(IsbnNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleIsbnNotFoundException(Exception e) {
		return new ResponseEntity<CustomErrorResponse>(new CustomErrorResponse(new Date(), 
				HttpStatus.NOT_FOUND.value(), IsbnNotFoundException.STATUS, e.getMessage()), 
				HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(IsbnInvalidException.class)
	public ResponseEntity<CustomErrorResponse> handleIsbnInvalidException(Exception e) {
		return new ResponseEntity<CustomErrorResponse>(new CustomErrorResponse(new Date(), 
				HttpStatus.BAD_REQUEST.value(), IsbnInvalidException.STATUS, e.getMessage()), 
				HttpStatus.BAD_REQUEST);
	}
}
