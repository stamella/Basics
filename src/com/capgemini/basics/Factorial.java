package com.capgemini.basics;

public class Factorial {

	public static int findFact(int number) {
		int fact=1;
		while(number>0) {
			for(int c=1;c<=number;c++) {
				fact=fact*c;
			}
		
		return fact;
		}
		return 0;

   }
}


