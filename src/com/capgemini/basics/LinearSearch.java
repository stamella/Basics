package com.capgemini.basics;

public class LinearSearch {
    public static Object findElement(int number) {
			int[] array= {45,67,1,2,3,4,5,6,7,8};
		for(int i=0;i<array.length-1;) {
			
			if(number == array[i]) {
				System.out.println("Element is present at " +(i) + "th position" );
				return true;
			
			}
			else
				i++;
			
		}
		
		return false;
	}

}
