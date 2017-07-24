package com.graphical.weather.gov.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;


              
public class Temperature
{
   
    private String name;    
	
    private List<Integer> value;   

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public List<Integer> getValue()
    {
        return value;
    }

    public void setValue (List<Integer> value)
    {
        this.value = value;
    }

   
}
			
			