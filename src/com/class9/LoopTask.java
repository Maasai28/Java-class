package com.class9;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		

/*	6. Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
 *  As soon as the user enters the correct leap year exit the loop.*/
		  
		
		
//		    Scanner sc;	
//	
//		
//			int leapYear = 2004;
//			int inp;
//			sc = new Scanner(System.in);
//			for (int z = 2000; z <=2010; z++) {
//				System.out.println("Please choose a leap year");
//				inp = sc.nextInt();
//				if (inp>leapYear) {
//					System.out.println("You missed the year");
//				}else if (inp<leapYear) {
//					System.out.println("You're almost at the year");
//				}else {
//					System.out.println("You've got it");
//					break;
//				}
//			}
	
	int leapYear;
	Scanner scan = new Scanner(System.in);
	for (int i = 2000; i<=2010; i++) {
		System.out.println("Please choose a leap year");
		leapYear = scan.nextInt();
		if ((leapYear%4==0 && leapYear%100!=0) || leapYear%400==0) {
			System.out.println(leapYear + " is a Leap Year");
			break;
		}else {
			System.out.println(leapYear + " is not a Leap Year");
		}
	}
	
	
	}		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


