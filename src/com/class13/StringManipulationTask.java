package com.class13;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
	

		// Create a String and print it in reverse order (Sunday → yadnuS).
        String str = "Sunday";
        for (int i =str.length(); i>=0; i--) {
        	System.out.println(str.charAt(i) + " ");
        }   
    
       /*Create a String and if the String is not empty perform the following:
        *  if the String has an odd number of characters and has 3 or more characters, 
        *  print the character in the middle of the String
        */
	String str1 = "My eclipse is not executing";
	if (!str1.isEmpty()) {
		if (str1.length()%2!=0 && str1.length()>=3) {
			System.out.println(str1.charAt(str1.length()/2));
		}else {
			System.out.println("Str1 has even # characters less than 3rd character");
		}
	}else {
		System.out.println("str1 is empty");
	}
	
	  /*  Write a program that reads two people’s first names and if they expecting boy or girl?
	   *  Based on the input suggests a name for a baby:
		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? boy
		Suggested baby name: DANRY

		Example Output:
		Mom’s first name? Mary
		Dad’s first name? Daniel
		Boy or Girl? girl
		Suggested baby name: MAIEL
	*/
	
	Scanner scan=new Scanner(System.in);
    System.out.println("Moms first name?");
    String momsChoice=scan.nextLine();
    System.out.println("Dad’s first name?");
    String dadsChoice=scan.nextLine();
    System.out.println("Boy or Girl?");
    String gender=scan.nextLine();
    
    switch(gender){
    
    case "girl":
        System.out.println(momsChoice.substring(0, momsChoice.length()/2)+dadsChoice.substring(dadsChoice.length()/2));
        break;
    case "boy":
        System.out.println(dadsChoice.substring(0,dadsChoice.length()/2)+momsChoice.substring(momsChoice.length()/2));
        break;
	
    }
	
	}
	
}
	


