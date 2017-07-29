package com.graphical.weather.gov.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.graphical.weather.gov.exception.ServiceException;
import com.graphical.weather.gov.service.WeatherReportService;

@RestController
@RequestMapping(value = "/weather")
public class WeatherReport {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	WeatherReportService service;

	@RequestMapping(value = "/forecastMaxTemp", method = RequestMethod.GET)
	public String forecastMaxTemp(@RequestParam String zipCodeList)
			throws ServiceException {
		Integer forcastMaxTemp = service.forcastMaxTemp(zipCodeList);
		if (forcastMaxTemp != null)
			return String.valueOf(forcastMaxTemp);
		else
			return "Sorry there is an issue with Service";
	}

}
