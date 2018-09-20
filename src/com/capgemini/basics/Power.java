package com.capgemini.basics;

public class Power {

	public static double calPower(double number, double power) {
		
		/*return Math.pow(number, power);*/
		 
		if(power==1)
			   return number;
		else if(power==0)
			   return 1;
		
		if(number==0) {
			return 0;
		}
		 
		  double result=1;
		 for(int i=1;i<=power;i++) {
	     	result = number*result;
		   
		  }
		   return result;
	
	}
}
