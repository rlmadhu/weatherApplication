package com.graphical.weather.gov.service;

import com.graphical.weather.gov.exception.ServiceException;

public interface WeatherReport {
	
	public Integer forecastMaxTemp(String zipCodeList) throws ServiceException;
}
