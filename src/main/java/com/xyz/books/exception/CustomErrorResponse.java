package com.xyz.books.exception;

import java.util.Date;

public class CustomErrorResponse {

	private Date timestamp;
	private int code;
	private String status;
	private String message;
	
	public CustomErrorResponse(Date timestamp, int code, String status, String message) {
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.code = code;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
