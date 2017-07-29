package com.graphical.weather.gov.service;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.graphical.weather.gov.constants.Constants;
import com.graphical.weather.gov.enumeration.Operation;
import com.graphical.weather.gov.exception.ServiceException;
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
	 * This method is used to collect the max temperature by calling NDFD Rest
	 * Service
	 * 
	 * @param zipCodeList
	 * @return
	 * @throws ServiceException
	 */
	public Integer forcastMaxTemp(String zipCodeList) throws ServiceException {

		URI targetUrl = populateParams(zipCodeList);
		String response = null;
		Integer maxTemp;
		try {
			response = restTemplate.getForObject(targetUrl, String.class);
			maxTemp = parseXML.parseXML(response);
		} catch (HttpClientErrorException e) {
			HttpStatus status = e.getStatusCode();
			throw new ServiceException(status.getReasonPhrase());
		} catch (Exception e) {
			String message = e.getMessage();
			throw new ServiceException(message);
		}

		return maxTemp;
	}

	/**
	 * This method is used to populate the parameters required for NDFD REST
	 * Service.
	 * 
	 * @param zipCodeList
	 * @return URI TargetURI with all the parameters
	 */
	private URI populateParams(String zipCodeList) {
		SimpleDateFormat sdf = new SimpleDateFormat(
				Constants.YYYY_MM_DD_T_HH_MM_SS);
		Calendar cal = Calendar.getInstance();
		String currentDate = sdf.format(cal.getTime());
		cal.add(Calendar.DATE, days);
		String endDate = sdf.format(cal.getTime());
		URI targetUrl = UriComponentsBuilder.fromUriString(api)
				.queryParam(Constants.ZIP_CODE_LIST, zipCodeList)
				.queryParam(Constants.BEGIN, currentDate)
				.queryParam(Constants.END, endDate)
				.queryParam(Constants.MAXT, Operation.MAXT.getDesc()).build()
				.encode().toUri();
		return targetUrl;
	}

}
