package com.shiva.exception;

public class UserExist extends RuntimeException {
private String message;

	public UserExist(String message)
	{
		super(message);
		this.message=message;
	}
}
