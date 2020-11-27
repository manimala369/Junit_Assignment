package com.book.app;

public class BookNotFoundException extends RuntimeException{
	
	public BookNotFoundException(String message) {
		super(message);
	}
}
