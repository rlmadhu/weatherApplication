package com.graphical.weather.gov.model;
              
public class Data
{
    private Location location;

    private Time timelayout;

    private Parameters parameters;

    private MoreWeatherInformation moreWeatherInformation;

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public Time gettimelayout ()
    {
        return timelayout;
    }

    public void settimelayout (Time timelayout)
    {
        this.timelayout = timelayout;
    }

    public Parameters getParameters ()
    {
        return parameters;
    }

    public void setParameters (Parameters parameters)
    {
        this.parameters = parameters;
    }

    public MoreWeatherInformation getMoreWeatherInformation ()
    {
        return moreWeatherInformation;
    }

    public void setMoreWeatherInformation (MoreWeatherInformation moreWeatherInformation)
    {
        this.moreWeatherInformation = moreWeatherInformation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [location = "+location+", timelayout = "+timelayout+", parameters = "+parameters+", moreWeatherInformation = "+moreWeatherInformation+"]";
    }
}
			
			