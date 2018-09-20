package com.capgemini.basics;

public class Electricity {

	public static double calcBill(double units) {
		while(units>0) {
		if(units<=100)
		return units*2;
		else if(units<=200)
	    return units*2.5;
		else if(units<=300)
			return units*3;
		else if(units>300)
			return units*4;
		
	}
		return 0;
	}

}
