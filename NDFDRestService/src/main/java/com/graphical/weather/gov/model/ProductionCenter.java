package com.graphical.weather.gov.model;
                 
public class ProductionCenter
{
    private String content;

    private String subcenter;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getsubcenter ()
    {
        return subcenter;
    }

    public void setsubcenter (String subcenter)
    {
        this.subcenter = subcenter;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", subcenter = "+subcenter+"]";
    }
}
			