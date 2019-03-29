package com.JavaReview;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
	/*Write a guessing game where the user has to guess a secret number between 1 and 20. 
	 * After every guess input, the program tells the user whether their number was too large or too small. 
	 * The program will keep asking the user to enter the number until he finds the correct number. 
	 * When the correct answer is found the system should display "Congratulations!!. You got it!".
	 * 	
	 */
	
	Scanner scan;
	int i = 10;
	int input;	scan =new Scanner(System.in);

     for (int x =0; x<=20; x++) {
		 System.out.println("Please guess a number");            //do{
		 input = scan.nextInt();                                  // System.out.println("Enter number);
		 if (input<i) {                                           //input = scan.nextInt();
		System.out.println("Your number is too small");	          //if(input<i) {
		                                                          //System.oun.println("Small number");
		}else if (input>i) {                                      //}else if (input>i)
		System.out.println("Your number is too big");              //    ("Large number")
		                                                           //    }while (i!=input);
		}else {                                                     //   ("congratulations")
	    
	    	System.out.println("Congratulations! You got it!");
		   break;
		}
		}
	}
} 

	
	
 
