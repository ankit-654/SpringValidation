package com.example.demo.exception;

public class errorResponse {

	private int errorCode;
	private String errorMessage;
	private String supportMessage;
	public errorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public errorResponse(int errorCode, String errorMessage, String supportMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.supportMessage = supportMessage;
	}
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
	public String getSupportMessage() {
		return supportMessage;
	}
	public void setSupportMessage(String supportMessage) {
		this.supportMessage = supportMessage;
	}
}
