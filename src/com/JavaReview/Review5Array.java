package com.JavaReview;

public class Review5Array {

	public static void main(String[] args) {
//		int i = 0;     //  index - Identify box
//		int j = 1;     //  value - Inside box
//		int k = 4;     //  element - Box
//		int[] arr = new int [3];   // same int[] arr = {0, 0, 0}
//		System.out.println(arr[0]); // zero is the default value of integers
	
		/* Write a program to sum the values of an array

		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	*/
	int[] arr = new int[10];
	int size = arr.length;
	int sum = 0;
	for (int i = 1; i< size; i++) {
		sum = sum +arr[i];            // sum +=arr[i}
		
	}
	System.out.println("The sum of all array elements = " + sum);
	
/* Program to test if an array contains
 * a specific value
 * 
 * 1_10
 * specific value 6
 * Use boolean flag	
 */
int[]numbers = new int[10];	
 for ( int i = 1; i<numbers.length; i++) {
	 if (i!=6) {
		 System.out.println(i + "This is not the number");
	 }else {
		 System.out.println(i + "you found the number");
	 }
 }
	
	
	
	
	}

}
