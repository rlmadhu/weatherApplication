package com.graphical.weather.gov.model;
                 
public class Source
{
    private String feedback;

    private String moreinformation;

    private String creditlogo;

    private String disclaimer;

    private ProductionCenter productioncenter;

    private String credit;

    public String getFeedback ()
    {
        return feedback;
    }

    public void setFeedback (String feedback)
    {
        this.feedback = feedback;
    }

    public String getmoreinformation ()
    {
        return moreinformation;
    }

    public void setmoreinformation (String moreinformation)
    {
        this.moreinformation = moreinformation;
    }

    public String getcreditlogo ()
    {
        return creditlogo;
    }

    public void setcreditlogo (String creditlogo)
    {
        this.creditlogo = creditlogo;
    }

    public String getDisclaimer ()
    {
        return disclaimer;
    }

    public void setDisclaimer (String disclaimer)
    {
        this.disclaimer = disclaimer;
    }

    public ProductionCenter getproductioncenter ()
    {
        return productioncenter;
    }

    public void setproductioncenter (ProductionCenter productioncenter)
    {
        this.productioncenter = productioncenter;
    }

    public String getCredit ()
    {
        return credit;
    }

    public void setCredit (String credit)
    {
        this.credit = credit;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [feedback = "+feedback+", moreinformation = "+moreinformation+", creditlogo = "+creditlogo+", disclaimer = "+disclaimer+", productioncenter = "+productioncenter+", credit = "+credit+"]";
    }
}