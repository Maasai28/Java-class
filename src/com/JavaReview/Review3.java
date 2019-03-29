package com.JavaReview;

public class Review3 {

	public static void main(String[] args) {
		/*Write a program to find out what to do
		 * for the folling temperatures.*/
		 int temp = 23;
		 String act;
		 if (temp> 100) {
			 act = "Stay inside it's too hot";
		 }else if (temp>50 && temp<99) {
			 act = "Summer cloths";
		 }else if (temp>30 && temp<49) {
			 act = "Wear winter cloths";
		 }else if (temp>10 && temp<29) {
			 act = "Stay inside it's too cold";
		 }else  {
			 act = "Call for help";
		 }
System.out.println("When it's " + temp + " I'll " + act);
	}
}

 