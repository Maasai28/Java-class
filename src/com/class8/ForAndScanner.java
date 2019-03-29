package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		/*Prompt user to enter 2 integers and compare
		 * Print Largest
		 Print 5 times*/

	   Scanner myScanner;
	   int num1,num2; 
	   myScanner = new Scanner(System.in);
	   int largest = 0;
	
	   
	  
 for (int i = 1; i<=5; i++) { 
			System.out.println("Please enter 1st number");
			num1 = myScanner.nextInt();

			System.out.println("Please enter 2nd number");
			num2 = myScanner.nextInt(); 
	  
   if (num1>num2) {
		   largest = num1;
	   }else if (num2>num1) {
		   largest = num2;
	   }else {
		   System.out.println(num1+ "is equal to " +num2);
	   }
	System.out.println(largest + " is the largest number");
	}
}
}