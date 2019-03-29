package com.class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
/* Write a program that prints activity in good weather
 * Good weather 40 degrees and 180 degrees and no rain---hiking otherwise no hiking
 * Between 25-40 inclusive and snowing we go snowboarding otherwise no snowboarding
 * More than 80 & sunny go to the beach otherwise no beach
 */
	Scanner scan;
	boolean snow, rain, sunny;
	int temp;
	String activity = "";
	
	scan = new Scanner(System.in);
	
	System.out.println("Please enter a temperature");
	temp = scan.nextInt();   
	
	 
	if (temp>=40 && temp<=80) {
		System.out.println("Is it raining?");
		rain = scan.nextBoolean();
		if (rain=true) {
			 activity = "watch a movie";
		}else {
			activity = "Go hiking";
	}	
	
	}else if (temp>=25 && temp<=40)	{
		System.out.println("Is it snowing?");
		snow = scan.nextBoolean();
		if (snow=true) {
			activity = "Snow boarding";
		
		}else {
			activity = "Do coding";
		}
	}else if (temp>80) {
		System.out.println("Is it sunny?");
		sunny = scan.nextBoolean();
		if (sunny=true) {
			activity = "Beach";
		}else {
			activity = "More coding";
		}	
	}else {
		System.out.println("Please enter different temperature");
		     activity = "Unknown";
		}
	System.out.println("Our activity is " + activity);
	           
		}
			
			
	}
		
		
	
	

	


