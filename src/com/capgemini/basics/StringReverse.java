package com.capgemini.basics;

public class StringReverse {

	public static Object printReverse(String string) {
		
		String str = "swathi";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
	        reverse= reverse+str.charAt(i);
		}
			return reverse;
		
		
		
		
	}

}
