package com.class4;

import java.util.Scanner;

public class NestedIfProject {

	public static void main(String[] args) {
		/* Mortgage rate and mortgage price.
		 * First program if mortgage rate is higher than 4.5-->will not buy a house
		 * Otherwise will consider buying
		 * User decides to buy house if larger than 200000 with take loan
		 * otherwise will pay cash
		
		float rate = 4.3f;
		int price = 200000; 
	    double eligibleRate = 4.5;
		
		if (rate>eligibleRate) {
			System.out.println("will not buy the house");
		}else {
			System.out.println("buy the house");
			if (price>=200000) {
				System.out.println("Get a loan");
			}else {
				System.out.println("Pay cash");
			}
		}*/
		
		/* Write program asking user to enter # years worked and salary
		 * If more than or equal 5 years worker is eligible for bonus
		 * Otherwise his not
		 * Once eligible: salary > 50000 then bonus 5000
		 * otherwise bonus 3000   */ 
		
		int num1 = 5;
		int num2 = 50000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of years worked");
		
		num1 = scan.nextInt();
		
		
		if (num1<5) {
			System.out.println("You do not qualify for a bonus");
			
		}else {
			System.out.println("You qualify for a bonus");
			System.out.println("Please enter your annual salary");
		
		num2 = scan.nextInt();	
		if (num2>50000) {
			System.out.println("You qualify for a bonus of 5000");
		}else { 
			System.out.println("You qualify for a bonus of 3000");
		}
	
			
		}
		
	}
}






	



	
	// Write a program to ask user number of years worked and annual salary
	


          
          