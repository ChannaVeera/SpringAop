package com.aop.exception;
public class EmpException extends RuntimeException {
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public EmpException(String message) {
	
		this.message = message;
	}

}
