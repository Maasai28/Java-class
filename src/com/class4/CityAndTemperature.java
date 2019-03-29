package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

public static void main(String[] args) {
	 
	/* Ask user to enter city and temperature in Fahrenheit
	 * Your program should convert FAHRENHEIT TO CELCIUS
	 * Your program should say "The Temp in the city --is...C
	 */
	
	String cityName; 
	int temp;
	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("Please enter your city");
	
	cityName = myScanner.nextLine();
	System.out.println("please enter temperature in Fahrenheit");
	
	temp = myScanner.nextInt();
	// formula (F _32) *5/9
	
	int convertedTemp = (temp - 32)*5/9;
	
	System.out.println("TChenhe temperature in the city " +cityName+ " is " +convertedTemp +"C");
	
}
}
