package com.springRest.demo.SpringRest.utility;

public class BadRequest extends Exception {

	private String errorMessage;

	public BadRequest(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public BadRequest() {
		super();
	}
}
