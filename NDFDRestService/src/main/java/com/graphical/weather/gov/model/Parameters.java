package com.graphical.weather.gov.model;


public class Parameters
{
	private Temperature temperature;

    public Temperature getTemperature ()
    {
        return temperature;
    }

    public void setTemperature (Temperature temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public String toString()
    {
        return "ClassPojo  temperature = "+temperature+"]";
    }
}
			
			