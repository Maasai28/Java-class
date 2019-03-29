package com.class6;

import java.util.Scanner;

public class SwitchGradeExplanation {

	public static void main(String[] args) {
		/*Allow user to enter grade then provide explanation
		 * A is Excellent B is good...
		 * Print grade entered and explanation
		 */
Scanner scan;
char grade;
String expl;

scan = new Scanner(System.in);
System.out.println("Please enter your grade");
grade = scan.next().charAt(0);

switch (grade) {
     case 'A':
    	 expl = "Excellent";
    	 break;
     case 'B': 
    	 expl = "Good";
    	 break;
     case 'C':
    	 expl = "Average";
    	 break;
     case 'D':
    	 expl = "Bad";
    	 break;
     

System.out.println("You grade is " + grade + " this is " +expl);
	}
	}
}
