package com.graphical.weather.gov.model;
                 
public class Location
{
    private String locationkey;

    private Point point;

    public String getLocationkey ()
    {
        return locationkey;
    }

    public void setLocationkey (String locationkey)
    {
        this.locationkey = locationkey;
    }

    public Point getPoint ()
    {
        return point;
    }

    public void setPoint (Point point)
    {
        this.point = point;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [locationkey = "+locationkey+", point = "+point+"]";
    }
}
			
			