package com.techrocking.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiError {
	private HttpStatus status;
	private String message;

	public ApiError(String message, HttpStatus status) {
		this.status = status;
		this.message = message;
	}
}
