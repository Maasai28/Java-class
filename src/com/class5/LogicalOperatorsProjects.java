package com.class5;

import java.util.Scanner;

public class LogicalOperatorsProjects {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//
//		int height;
//		System.out.println("please enter height");
//		height = scan.nextInt();
//		
//		if (height<5) {
//			System.out.println("Short");
//		}else if (height>=5 && height<=6) {
//			System.out.println("Medium");
//		}else if (height>6) {
//			System.out.println("Tall");
//      }else { 
//		System.out.println("Invalid);
//		}
//		Average grade from mid-terms, quiz and finals
		
		int quiz;
		int mid;
		int fin;
		
		System.out.println("Please enter quiz");
		quiz = scan.nextInt();
		System.out.println("Please enter mid-terms");
		mid = scan.nextInt();
		System.out.println("Please enter finals");
		fin = scan.nextInt();
		
		int score = (quiz+mid+fin)/3;
		
		if (score>=90) {
			System.out.println("A");
		}else if (score>=70 && score<=90) {
			System.out.println("B");
		}else if (score>=50 && score<=70) {
		System.out.println("C");
		}else {
			System.out.println("F");
			
			
			
		}
		
		
		
	}

}
