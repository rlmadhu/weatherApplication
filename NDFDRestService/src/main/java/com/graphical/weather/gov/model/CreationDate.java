package com.graphical.weather.gov.model;
                
public class CreationDate
{
    private String content;

    private String refreshfrequency;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getrefreshfrequency ()
    {
        return refreshfrequency;
    }

    public void setrefreshfrequency (String refreshfrequency)
    {
        this.refreshfrequency = refreshfrequency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", refreshfrequency = "+refreshfrequency+"]";
    }
}
			
			