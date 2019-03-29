package com.class5;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*   Logical AND &&                         Logical OR ||                Logical NOT !
 * TRUE AND TRUE = TRUE                 TRUE OR TRUE = TRUE             TRUE = FALSE
 * TRUE AND FALSE = FALSE               TRUE OR FALSE = TRUE            FALSE = TRUE
 * FALSE AND TRUE = FALSE               TRUE OR TRUE = TRUE
 * FALSE AND FALSE = FALSE              FALSE OR FALSE = FALSE
 */
		/* If number is between 1-10 the number is small
		 * if number is between 11-100 the number is between
		 * if number is between 101-1000 the number is large
//		 */
//	int num = 15;
//	   // TRUE  AND FALSE = FALSE
//	if (num>= 1 && num<=10) {
//		System.out.println("number is small");
//		// TRUE AND TRUE = TRUE 
//	}else if (num>=11 && num<=100) {
//		System.out.println("number is medium");
//		//FALSE AND TRUE = FALSE
//	}else if (num>=101 && num<=1000) {
//		System.out.println("number is large");
//	}else {
//		System.out.println("number is out of range");
//		
//	}       
		/* Ask user to enter age
		 * if age>1 but <3  baby
		 * ifage>3  but  <5 toddler
		 * if age>5 but <13 kid
		 * if age>13 but <20 teenager
		 * if >20 but <64 adult
		 * if >64 senior
		 */
		Scanner myScanner;
		int age;
		
		myScanner = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = myScanner.nextInt();
		
		if (age>=1 && age<5) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<=5) {
			System.out.println("You are a toddler");
		}else if (age>=5 && age<13) {
	        System.out.println("You are a kid");
		}else if (age>=13 && age<20) {
			System.out.println("You are a teenager");
		}else if (age>=20 && age<64) {
			System.out.println("you are an adult");
		}else {
			System.out.println("You are a senior");
		}
		
		
		
		
		
		 
	}
	
}
