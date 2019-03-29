package com.JavaReview;

public class ReviewArray {

	public static void main(String[] args) {
		// program to print length of each array
int[][] ar = {
		{1,2,3,},
		{4,5,6,9},
		{7,8}
          };
//using a for loop

	for (int i =0; i<ar.length; i++) {
		System.out.println("Length of row" + (i +1) + " = " + ar[i].length);
	}
	
	for (int[]inner:ar) {
//		System.out.println("Length of row" = + inner.length);
	}
	
	//Program to print all elements
	
	for (int i =0; i <ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.println(ar[i][j]);
		}
	}
	// using for each loop
	for(int[] inn:ar) {
		for(int elements: inn) {
			System.out.println(elements);
		}
	}
	
	
	}
}
