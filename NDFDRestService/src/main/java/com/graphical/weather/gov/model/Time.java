package com.graphical.weather.gov.model;
                
public class Time
{
    private String summarization;

    private String[] endvalidtime;

    private String layoutkey;

    private String[] startvalidtime;

    private String timecoordinate;

    public String getSummarization ()
    {
        return summarization;
    }

    public void setSummarization (String summarization)
    {
        this.summarization = summarization;
    }

    public String[] getendvalidtime ()
    {
        return endvalidtime;
    }

    public void setendvalidtime (String[] endvalidtime)
    {
        this.endvalidtime = endvalidtime;
    }

    public String getlayoutkey ()
    {
        return layoutkey;
    }

    public void setlayoutkey (String layoutkey)
    {
        this.layoutkey = layoutkey;
    }

    public String[] getstartvalidtime ()
    {
        return startvalidtime;
    }

    public void setstartvalidtime (String[] startvalidtime)
    {
        this.startvalidtime = startvalidtime;
    }

    public String gettimecoordinate ()
    {
        return timecoordinate;
    }

    public void settimecoordinate (String timecoordinate)
    {
        this.timecoordinate = timecoordinate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [summarization = "+summarization+", endvalidtime = "+endvalidtime+", layoutkey = "+layoutkey+", startvalidtime = "+startvalidtime+", timecoordinate = "+timecoordinate+"]";
    }
}
			
			