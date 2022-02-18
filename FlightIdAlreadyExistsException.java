package com.mouritech.onlineflightticketbookingapplication.exception;

public class FlightIdAlreadyExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public FlightIdAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
	
}
