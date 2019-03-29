package com.class4;
 import java.util.Scanner;

public class ScannerProjects1 {
  
 public static void main( String[] args) {
	// loan Specialist
	/*int num1;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter loan amount");
	
	num1 = scan.nextInt();
	
	if ( num1<20000) {
		System.out.println("You qualify for the loan");
	}else {
		System.out.println("YOU don't qualify");*/ 
		// Id and Learners Permit
//		
//		int num2;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your age");
//		
//		num2 = sc.nextInt();
//		
//		if (num2>18) {
//			System.out.println("You can get your ID");
//			
//		}else {
//			System.out.println("You can get you Learners Permit");
//		
//	}    check if user has credit card
	 /*  If balance more than 1000--->pay off
	  * else you are good
	  */
	boolean creditCard = true;
	int balance = 1000;
	
	if (creditCard) {
		System.out.println("Check balance");
		if (balance>=1000) {
			System.out.println("Pay off now");
		}else if (balance==0) {
			System.out.println("Please use your card");
		}else {
			System.out.println("You are safe");
		}
	}else {
		System.out.println( "Do you want a credit card");
	}
	
	
	
	
	
	}
	}

