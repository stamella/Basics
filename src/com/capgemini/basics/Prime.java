package com.capgemini.basics;

public class Prime {

	public static boolean checkPrime(int number) {

		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
			else
				return true;
		}
		return false;
	}
}
		
	

