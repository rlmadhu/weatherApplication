package com.graphical.weather.gov.model;
                 
public class Product
{
    private String field;

    private String operationalmode;

    private String srsName;

    private String title;

    private String category;

    private CreationDate creationdate;

    private String concisename;

    public String getField ()
    {
        return field;
    }

    public void setField (String field)
    {
        this.field = field;
    }

    public String getoperationalmode ()
    {
        return operationalmode;
    }

    public void setoperationalmode (String operationalmode)
    {
        this.operationalmode = operationalmode;
    }

    public String getSrsName ()
    {
        return srsName;
    }

    public void setSrsName (String srsName)
    {
        this.srsName = srsName;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public CreationDate getcreationdate ()
    {
        return creationdate;
    }

    public void setcreationdate (CreationDate creationdate)
    {
        this.creationdate = creationdate;
    }

    public String getconcisename ()
    {
        return concisename;
    }

    public void setconcisename (String concisename)
    {
        this.concisename = concisename;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [field = "+field+", operationalmode = "+operationalmode+", srsName = "+srsName+", title = "+title+", category = "+category+", creationdate = "+creationdate+", concisename = "+concisename+"]";
    }
}
			
			