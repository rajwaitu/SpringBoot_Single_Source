package com.techrocking.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private HttpStatus status = null;

	public ProductNotFoundException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return this.status;
	}

}
