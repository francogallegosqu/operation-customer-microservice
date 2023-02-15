package com.tech.customer.exception;

public class OperationException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private String code = "OPERATION-001";
	public OperationException(String message) {
		super(message);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
