package com.graphical.weather.gov.parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

@Component
public class ParseXML {
	
	Logger log = Logger.getLogger(ParseXML.class);

	List<Integer> list = new ArrayList<Integer>();

	public Integer parseXML(String data) {

		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

				boolean value = false;

				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					if (qName.equalsIgnoreCase("value")) {
						value = true;
					}

				}

				public void endElement(String uri, String localName,
						String qName) throws SAXException {

				}

				public void characters(char ch[], int start, int length)
						throws SAXException {

					if (value) {
						value = false;
						list.add(Integer.valueOf(new String(ch, start, length)));
					}

				}

			};

			saxParser.parse(
					new InputSource(new ByteArrayInputStream(data.getBytes())),
					handler);

		} catch (Exception e) {
			log.error("Exception in parsing xml output ... ");
		}

		return Collections.max(list);
	}

}