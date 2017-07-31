package com.graphical.weather.gov.exception;

public class ServiceException extends Exception {

	/**
	 * Service Exception
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public ServiceException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public ServiceException() {
		super();
	}

}
