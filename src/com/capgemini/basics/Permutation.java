package com.capgemini.basics;

public class Permutation {

	public static double calPermutation(double n, double r) {
		
		
		return fact(n)/fact(n-r);
		
	}
    public static double calCombination(double n, double r) {
    	
		return (fact(n)/fact(n-r))/fact(r);
		
	}

	private static double fact(double number) {
		
		if(number==1) 
			return 1;
		else if(number==0) 
			return 1;
		else {
			double result =1;
			for(double i=number;i>0;i--) 
				result = result *i;
			   return result;
		    }
	}
	

}
