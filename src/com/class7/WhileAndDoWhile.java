package com.class7;

import java.util.Scanner;

public class WhileAndDoWhile {
	
	public static void main(String[] args) {
		
//		int a = 10;
//		
//		do {
//			System.out.println("Hello");
//			a++;
//		}while (a<15);
//			 
//		int b = 10;
//		while (b>15) {
//			System.out.println("Bye");
//			b++;
//		}
		
		//prompt user to ask name 3 times and print "you are doing great"
		
//		Scanner scan;
//		String name;
//		int a = 1;
//		scan = new Scanner(System.in);
//		
//		while (a <=3)  {
//			System.out.println("Please enter your name");
//			name = scan.nextLine();
//			System.out.println("You are doing great" + name);
//			a++;
//		}
    	/*Ask user to pay for soda
		 * Keep asking user to pay for soda until entered is not equal to $1.99
		 * after user got a right amount print "please enjoy your soda
		 */
		Scanner scan;
		double soda= 0;
		scan = new Scanner(System.in);
		
		while (soda != 1.99) {
			System.out.println("Please pay for soda");
			soda = scan.nextDouble();
			
					}
	System.out.println("Please enjoy your soda");
	
	}
	}


