package com.capgemini.basics;

public class BinarySearch {

	public static Object findElement(int number) {
		int c, first, last, middle;
		int[] arr= {67,45,89,28,253,4,1,25,58,69,41};
		int n=arr.length;
		first  = 0; // Basic binary search

		last   = n - 1;

		middle = (first + last)/2;

		while( first <= last )

		{

		if ( arr[middle] < number )

		first = middle + 1;

		else if ( arr[middle] == number )

		{

		System.out.println(number + " found at location " + (middle + 1) + ".");
		return true;

		

		}

		else

		{

		last = middle - 1;

		}

		middle = (first + last)/2;

		if ( first > last ){

		System.out.println(number + " is not present in the list.\n");

		}

		}
		return null;
		
	}
}