package com.xyz.books.exception;

public class IsbnNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	static final String STATUS = "ISBN_NOT_FOUND";
	
	public IsbnNotFoundException() {
		super("The ISBN entered is not found.");
	}
	
}
