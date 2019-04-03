package com.interVie;

public class InterviewQuestions1 {

	public static void main(String[] args) {
	
		/*1. Write a program to swap 2 numbers without a temporary variable?
				Swap  2 strings without a temporary variable?
	*/
	String a = "4";
	String b = "5";
	System.out.println(a.replace(a, b));
	System.out.println(b.replaceAll(b, b));
	
	/*2.Write a java program to find the second largest number in the array? 
	 *Maximum and minimum number in the array?
	 */
	System.out.println(" ----------------------------------------");
	int [] num = {10,20,30,40,50,60};
	int largest = num[0];
	int secondLargest = num[0];
	int thridLargest = 0;
	for ( int i = 0; i <num.length; i++) {
		if (num[i]>largest) {
			thridLargest = secondLargest;
			secondLargest = largest;
			largest = num[i];
			
		}
	}
	
	System.out.println(largest);
	System.out.println(secondLargest);
	System.out.println(thridLargest);
	}
}
