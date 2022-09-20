package com.xyz.books.exception;

public class IsbnInvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	static final String STATUS = "ISBN_INVALID";

	public IsbnInvalidException() {
		super("INVALID ISBN");
	}
}
