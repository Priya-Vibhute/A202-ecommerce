package com.learn.ecommerce.exceptions;

public class IdNotFoundException extends RuntimeException {

	public IdNotFoundException()
	{
		super();
	}
	
	public IdNotFoundException(String message)
	{
		super(message);
	}
	
}
