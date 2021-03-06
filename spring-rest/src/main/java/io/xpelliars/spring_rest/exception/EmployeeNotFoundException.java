package io.xpelliars.spring_rest.exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -336943968554211301L;

	public EmployeeNotFoundException (String message) {
		super(message);
	}
	
	public EmployeeNotFoundException (String message, Throwable cause) {
		super(message, cause);
	}
}
