package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		
		//Take a number from  a user and print that number
		
		/*int num = 22;
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter any number");
		int myNumber = scan.nextInt();
		
		System.out.println("The number you entered is " +myNumber);
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter your name");
		
		String name = input.nextLine();
		
		
		System.out.println("Good morning " +name);*/
		
		//Scanner andIf: Take 2 numbers from user and compare those numbers
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Please enter first number");
		
		num1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		
		num2 = sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1>num2) {
			System.out.println(num1 + " is larger than " +num2);
		}else if (num2>num1) {
			System.out.println(num1 + " is smaller than " +num2);
		}else {
			
			
			
		}
		
	
	}

}
