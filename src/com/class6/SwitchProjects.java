package com.class6;

import java.util.Scanner;

public class SwitchProjects {

	public static void main(String[] args) {
		/* User enter country
		 * Based on country favorite food
		 */
       Scanner scan;
       String country;
       String food;
       
       scan = new Scanner(System.in);
       System.out.println("Enter country");
       country = scan.nextLine();
       
       switch (country) {
     
       case "USA":
    	   food = "Burger";
    	   break;
       case "Russia":
    	   food = "Pelmeni"; 
    	   break;
       case"Italy":
    	   food = "Pasta";
    	   break;
       case "Turkey":
    	   food = "Baklava";
    	   break;
       case "Pakistan":
    	   food = "Biryani";
    	   break;
       default:
    	   food = "Unknown";
       }
       System.out.println("Your food is " +food);
    	   
       }
}
       
       
	


