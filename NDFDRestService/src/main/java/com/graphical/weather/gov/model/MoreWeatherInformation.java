package com.graphical.weather.gov.model;
                 
public class MoreWeatherInformation
{
    private String content;

    private String applicablelocation;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getapplicablelocation ()
    {
        return applicablelocation;
    }

    public void setapplicablelocation (String applicablelocation)
    {
        this.applicablelocation = applicablelocation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", applicablelocation = "+applicablelocation+"]";
    }
}
			
			