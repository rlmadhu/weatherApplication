package com.graphical.weather.gov.enumeration;

public enum Operation {
	
	MAXT("maxt"),
	MINT("mint");
	private String op;

	Operation(String operation) {
        this.op = operation;
    }

    public String getDesc() {
        return op;
    }

}
