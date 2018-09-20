package com.capgemini.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Matrix {

	public static boolean calMul(int[][] is, int[][] is2) {
		
		int i,j = 0;
		int array1[][] = {{1,2},{3,4}};
		int array2[][] = {{5,6},{7,8}};
		int array[][] = new int[2][2];
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
			array[i][j] =  array1[i][j] + array2[i][j];
			}
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
			System.out.print(array[i][j]+"\t");
			
			}
			
			System.out.println("\n");
			
		}
		return true;
		
		
	}

}
