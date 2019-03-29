package com.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		/* 7 days a week
		 * if 1-5 weekday
		 * if 6-7 weekend
		 * otherwise "not a valid day
		 */
//         int day = 5;
//         // FALSE OR FALSE OR FALSE OR FALSE OR TRUE = TRUE
//         if (day==1 || day==2 || day==3 || day==4 || day==5) {
//        	 System.out.println("Weekday");
//        	// FALSE OR FALSE = FALSE
//         }else if (day==6 ||day==7) {
//        	 System.out.println("Weekend");
//         }else {  
//        	 System.out.println("Invalid");
//         }
		/* Write a program to find out largest of 3 double values
		 * Using if-else 
		 * Provided by user.
		 */
	Scanner scan = new Scanner(System.in);
//	
//	System.out.println("Please enter double value");
//	double d1 = scan.nextDouble();
//	System.out.println("Please enter 2nd double value");
//	double d2 = scan.nextDouble();
//	System.out.println("Please enter 3rd double value");
//	double d3 = scan.nextDouble();
//	
//	if (d1>d2 && d1>d3) {
//		System.out.println("The largest double is: " + d1);
//	}else if (d2>d1 && d2>d3) {
//		System.out.println("The largest double is: " + d2);
//	}else {
//		System.out.println("The largest double is: " + d3);
//			
//		}
//	}	
	
		
		/*Write a program to find largest of 3 numbers
		 * using nested if provided by user
		 */
	System.out.println("Enter 1st number");
	int num1 = scan.nextInt();
	System.out.println("Enter 2nd number");
	int num2 = scan.nextInt();
	System.out.println("Enter 3rd number");
	int num3 = scan.nextInt();
	
	if (num1>num2) {
		if (num1>num3)
			System.out.println("The largest number is: " + num1);
		else 
		    System.out.println("The largest number is: " + num2);
	}else {
		if (num2>num3)
			System.out.println("The largest number is: " + num2);
		else
			System.out.println("The largest number is: " + num3);
		
	}
	}
}
/*    if (num1>num2) {
               if (num1>num3) {
                    largest = num2;
               }else {
                     largest = num3;
                     }
      }else {
                 if (num2>num3) {
                      largest = num2;
                 }else {
                      largest = num3
                 }*/
}