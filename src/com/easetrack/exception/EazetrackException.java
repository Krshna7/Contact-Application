package com.easetrack.exception;

public class EazetrackException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode = -1;
	private String errorMessage = null;
	
	public int getErrorCode() {
		return errorCode;
	}

	public EazetrackException() {
		super();
	}
	
	public EazetrackException(String message) {
		super(message);
		this.errorMessage = message;
	}

	public EazetrackException(int code) {
		this.errorCode = code;
	}
	
	public EazetrackException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}


	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
