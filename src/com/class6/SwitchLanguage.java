package com.class6;

import java.util.Scanner;

public class SwitchLanguage {

	public static void main(String[] args) {
		/* Enter your country
		 * Find out language spoken
		 */
Scanner scan;
String country;
String language = 

scan = new Scanner(System.in);
System.out.println("Please enter your country"); 
country = scan.nextLine();

switch (country) {
     
     case "USA":
    	 language = "English";
    	 break;
     case "Kenya":
    	 language = "Swahili"; 
    	 break;
     case "France":
    	 language = "French";
    	 break;
     case "Portugal":
    	 language = "Portuguese";
    	 break;
     case "Mexico":
    	 language = "Spanish";
    	 break;
     case "Egypt":
    	 language = "Arabic";
    	 break;
     
}	 
  
   System.out.println("In " + country + " you speak " + language);  

	}
	}

