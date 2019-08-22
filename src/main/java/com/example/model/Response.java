package com.example.model;

public class Response {

	private int status;
	private String message;

	public Response(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

}
