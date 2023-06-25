package com.crm.app.exception;

public class CrmException extends Exception {
	
	private String message;
	
	public CrmException(String message) {
		super(message);
	}

}
