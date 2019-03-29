package com.class6;

import java.util.Scanner;

public class IfElseGrades {

	public static void main(String[] args) {
		/*Enter grade then provide explanation
		 * A=Excellent,B=Good,C=Average,D=Bad,other Not Acceptable
		 Print grade entered and */
		Scanner scan;
		char grade;
		String expl;
		scan = new Scanner(System.in); 
		System.out.println("Please enter your grade");
		grade = scan.next().charAt(0);
		
		if (grade=='A') {
			expl = "Excellent";
		}else if (grade=='B') {
			expl = "Good";
		}else if (grade=='C') {
			expl = "Average";
		}else if (grade=='D') {
			expl = "Bad";
		}else {
			expl = "Not Acceptable";
		}
		System.out.println("Your grade is " +grade +" this is " +expl);
	}	
}


