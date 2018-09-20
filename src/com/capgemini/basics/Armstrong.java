package com.capgemini.basics;

import java.util.function.BooleanSupplier;

public class Armstrong {

	public static boolean checkArmstrong(int number) {
		int remainder;
		int sum=0;
		int temp=number;
	    while(number>0) {
	    	remainder = number%10;
	    	sum += remainder*remainder*remainder;
	    	number = number/10;
	    }
		if(temp == sum) {
			return true;
		}
		return false;
	}

}
