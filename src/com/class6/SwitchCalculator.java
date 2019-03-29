package com.class6;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		/*Create calculator
		 * Allow user to enter 2 numbers
		 * Based on operator(+,-,*,/)
		 * Find result
		 */
Scanner scan;		
int num1,num2;
int result = 0;
char operator;

scan = new Scanner(System.in);
System.out.println("Enter your first number");
num1 = scan.nextInt();
System.out.println("Enter your operator");
operator = scan.next().charAt(0);
System.out.println("Enter your second number");
num2 = scan.nextInt();

    switch (operator) {
    case '+':
    	result = num1+num2;
    	break;
    case '-':
    	result = num1-num2; 
    	break;
    case '*':
    	result = num1*num2;
    	break;
    case '/':
    	result = num1/num2;
    	break;
    default:
    	System.out.println("Invalid");
    }
System.out.println("The result is: " + result);
	}

}
