package com.graphical.weather.gov.model;
                
public class Head
{
    private Product product;

    private Source source;

    public Product getProduct ()
    {
        return product;
    }

    public void setProduct (Product product)
    {
        this.product = product;
    }

    public Source getSource ()
    {
        return source;
    }

    public void setSource (Source source)
    {
        this.source = source;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [product = "+product+", source = "+source+"]";
    }
}
			
			