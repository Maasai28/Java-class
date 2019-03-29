package com.JavaReview;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/* 1. Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 */
 //for(startRange;endrange;increment
		Scanner scan;
		 int start;
		 int end;
		 int sum = 0;
		 int sum1 = 0;
		 scan = new Scanner(System.in);
		 System.out.println("Please enter start number");
		 start = scan.nextInt();
		 System.out.println("Please enter end number");
		 end = scan.nextInt();
		 
		for(int i = start; i<=end; i++) {
			if (i%2==0) {
				sum = sum + i;
			}else {
				sum1 = sum1 + i;
			}
		}
	System.out.println("Sum of even numbers: " + sum);
	System.out.println("Sum of odd numbers: " + sum1);
	}

}
