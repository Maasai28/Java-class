package com.practice;

import java.util.Scanner;

public class wia {

	public static void main(String args[]) {
		
//multiplication table of a number
		
	Scanner scan = new Scanner(System.in);	
	int i,y;
	System.out.println ("Enter number");
	y = scan.nextInt();
	for (i=0; i<=y; i++) {
		System.out.println(i + " X " + y + " = " + i*y);
	}
	}
}
