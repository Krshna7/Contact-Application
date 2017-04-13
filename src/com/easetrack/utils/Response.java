package com.easetrack.utils;

import com.easetrack.exception.EazetrackException;

public class Response {

	private int statusCode = Constant.SUCCESS;
	private Object data = null;
	private ErrorResponse error = null;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorResponse getError() {
		return error;
	}

	public void setError(EazetrackException error) {
		this.error = new ErrorResponse();
		this.error.setErrorCode(error.getErrorCode());
		this.error.setErrorMessage(error.getErrorMessage());
	}

	public String writeResponse() {
		return JsonHelper.objectToJson(this);
	}

	public class ErrorResponse {
		private int errorCode;
		private String errorMessage;

		public int getErrorCode() {
			return errorCode;
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
}
