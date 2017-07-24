package com.graphical.weather.gov.service;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.graphical.weather.gov.constants.Constants;
import com.graphical.weather.gov.enumeration.Element;
import com.graphical.weather.gov.parser.ParseXML;

@Service
public class WeatherReportService {
	public static Logger log = Logger.getLogger(WeatherReportService.class);

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ParseXML parseXML;

	@Value("${api.path}")
	private String api;

	@Value("${days}")
	private Integer days;

	/**
	 * 
	 * @param zipCodeList
	 * @return
	 */
	public Integer forcastMaxTemp(String zipCodeList) {

		SimpleDateFormat sdf = new SimpleDateFormat(
				Constants.YYYY_MM_DD_T_HH_MM_SS);
		Calendar cal = Calendar.getInstance();
		String currentDate = sdf.format(cal.getTime());
		cal.add(Calendar.DATE, days);
		String weekDate = sdf.format(cal.getTime());
		System.out.println(currentDate);
		System.out.println(weekDate);
		URI targetUrl = UriComponentsBuilder.fromUriString(api)
				.queryParam(Constants.ZIP_CODE_LIST, zipCodeList)
				.queryParam(Constants.BEGIN, currentDate)
				.queryParam(Constants.END, weekDate)
				.queryParam(Constants.MAXT, Element.MAXT.ele()).build()
				.encode().toUri();
		String response = restTemplate.getForObject(targetUrl, String.class);
		Integer maxTemp = parseXML.parseXML(response);
		return maxTemp;
	}

}
