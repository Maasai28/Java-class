package com.class6;

import java.util.Scanner;

public class IfElseCalculator {

	public static void main(String[] args) {
		/*Create a calculator and allow user to enter 2  numbers
		 * Based on operator(+-*,/) 
		 * Provide result*/
Scanner scan;         
int num1, num2; 
char op;
int result = 0;
scan = new Scanner(System.in);
System.out.println("Enter your first number");
num1 = scan.nextInt();
System.out.println("Enter your operator");
op = scan.next().charAt(0);
System.out.println("Enter your second number");
num2 = scan.nextInt();
if (op=='+') {
	result = num1+num2;
}else if (op=='-') {
	result = num1-num2;
}else if (op=='*') {
	result = num1*num2;
}else if (op=='/') {
	result = num1/num2;
}else {
	System.out.println("Invalid");
}	
	System.out.println("The result of " + num1 + " " + op + " " + num2 + " is " + result);
	

	}

}
