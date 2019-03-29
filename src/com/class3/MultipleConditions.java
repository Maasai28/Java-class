package com.class3;

public class MultipleConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a java program and declare int variable that will hold a day.
		 * Based on the value of the variable you program should print name of day
		 */
		int day = 1; //if program meets condition 1-12 it will execute and be done
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday - Fun day");
		}else if (day==6)  {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Not a day");
			 
			int month = 9;
			
			if (month==1) {
				System.out.println("January");
			}else if (month==2) {
				System.out.println("February");
			}else if (month==3) {
				System.out.println("March");
			}else if (month==4) {
				System.out.println("April");
			}else if (month==5) {
				System.out.println("May");
			}else if (month==6) {
				System.out.println("June");
			}else if (month==7) {
				System.out.println("July");
			}else if (month==8) {
				System.out.println("August");
			}else if (month==9) {
				System.out.println("September");
			}else if (month==10) {
				System.out.println("October");
			}else if (month==11) {
				System.out.println("November");
			}else if (month==12) {
				System.out.println("December");
			}else {
				System.out.println("Not a month");
			}
			 
		}

	}
}

