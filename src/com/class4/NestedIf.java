package com.class4;

public class NestedIf {

	/* Write a program to check work eligibility
	 * User <16 not allowed to work
	 * Otherwise--->allowed to work
	 * <64--> allowed
	 * othereise retire
	 */
	
	public static void main(String[] args) {
		
//		int age = 65;
//		int eligibleAge = 16;
//		int retirementAge = 64;
//		
//		if (age<eligibleAge) { 
//			System.out.println("You are too young");
//		}else {
//			System.out.println( "You are eligible to work");
//			if (age<retirementAge) {
//				System.out.println("Go work hard");
//			}else {
//				System.out.println("Pleases enjoy your life");
//			}
//		}
//		
//
	//}


		
		/* Declare variable for GPA and getting a diploma
		 * If user has a diploma-->congratulations
		 * if GPA is higher than 3.5 hire 
		 * otherwise do not hire
		 */

        double gpa = 3.6;
        double expectedGpa =3.7;
        boolean hasDiploma = true;
        
        if (hasDiploma) {
        	System.out.println("Congratulations");
        	if (gpa>expectedGpa) {
        		System.out.println("You are hired");
        	}else {
        		System.out.println("Unfortunately we cannot hire you");
        	}
        }else {
        	System.out.println("Please get your diploma");
        	}
        }
        
        
        
        
         
}
		 
		 
			
