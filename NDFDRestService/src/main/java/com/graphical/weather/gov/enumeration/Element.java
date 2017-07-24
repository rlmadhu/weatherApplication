package com.graphical.weather.gov.enumeration;

public enum Element {
	
	MAXT("maxt"),MINT("mint");
	private String element;

	Element(String ele) {
        this.element = ele;
    }

    public String ele() {
        return element;
    }

}
