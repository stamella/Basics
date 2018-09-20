package com.capgemini.basics;

public class Reverse {

	public static Object findReverse(int number) {
		 
		int sum=0;
		while(number>0) {
			int remainder=number%10;
			sum = sum*10+remainder;
			number = number/10;
		}
		return sum;
	}

}
