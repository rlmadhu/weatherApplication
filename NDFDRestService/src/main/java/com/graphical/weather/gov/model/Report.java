package com.graphical.weather.gov.model;

import java.io.Serializable;

public class Report implements Serializable
{
    private Dwml dwml;

    public Dwml getDwml ()
    {
        return dwml;
    }

    public void setDwml (Dwml dwml)
    {
        this.dwml = dwml;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dwml = "+dwml+"]";
    }
}