package com.graphical.weather.gov.model;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Dwml implements Serializable
{

    private Data data;

    private Head head;


    private String version;

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public Head getHead ()
    {
        return head;
    }

    public void setHead (Head head)
    {
        this.head = head;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", head = "+head+", version = "+version+"]";
    }
}
			