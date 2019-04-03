package com.interVie;

import java.util.Scanner;

public class InterviewQ2 {

	public static void main(String[] args) {
		
		/*
		 * 6. Write a Java Program to find whether a String is palindrome or not?
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward, e.g., madam or nurses run
		 */

		String a,b  = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the String you want to check");
		a = scan.nextLine();
        
		for (int i =a.length()-1; i >= 0; i--) {
			b += a.charAt(i);
		}
			if (a.equalsIgnoreCase(b)) {
				System.out.println (a + ": is a palindrome");
			} else {
				System.out.println(a + ": is not a palindrome");

			}

		
        /*. Write a java program to check whether a given number is prime or not?
         * Prime number is a number that is greater than 1 and is only divisible by 1 or itself
         * 0 and 1 are not prime numbers  **2 is the only even prime number.
         */
         
			int num = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter number to check");
			num = input.nextInt();
			
			if  ( num%2!=0 || num>=2) {
				System.out.println("This is a prime number");
				
			}else {
				System.out.println("This is not a prime number");
			}
				
	   /* Write a Java Program to print first 10 numbers of Fibonacci series.
	    *In fibonacci series, next number is the sum of previous two numbers 
	    *for example 0, 1, 1, 2, 3, 5, 8, 13, 17, 21, 55 etc. 
	    The first two numbers of fibonacci series are 0 and 1.
	    *
	    */
	    int series = 10;
		int num1=0;
		int num2=1;
	    int	num3 =0;
	for (int i = 1; i<= series; i++)	{
		num3 = num1 + num2;
		num1 = num2;
		num2 =num3;
		System.out.println(num1 +" " );
	}
		
		
	    
	}

}
