package com.class2;

public class ArithmeticOperarors {

	public static void main (String[] args) {
		
		 //declaring 2 int variables
		//performing addition, subtraction, multiplication, division
		
		int a=30;
		int b=15;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b); 
		System.out.println(a/b);
		
		//another method
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//print: the addition of a 30 and 15 numbers is 45
		
		System.out.println("The sum of 30 and 15 is "+sum);
		System.out.println("The divisio of 30 and 15 is "+div);
		System.out.println("The multiplication of 30 and 15 is "+mult);
		System.out.println("The division of 30 and 15 is "+div);
		
		
		double c=3.1;
		double d=2.2;
		
		double sum1=c+d;
		double sub1=c-d;
		double mult1=c*d;
		double div1=c/d;
		
		
		System.out.println("The sum of 3.1 and 2.2 "+sum1);
		System.out.println("The subtraction of 3.1 and 2.2 "+sub1);
		System.out.println("The multiplication of 3.1 and 2.2 "+mult1);
		System.out.println("The division of 3.1 and 2.2 "+div1);
		
	    //Write a program to print the area and perimeter of a rectangle with width=5 and height=8
		
		int w=5;
		int h=8;
		
		int area=w*h;
		int perimeter=w+w+h+h;
		
		
		System.out.println("the perimeter of a rectangle with width 5 and height 8 is equal to "+perimeter+ " and the area is "+area );
				
	    double money=9999.99;
		boolean isTrue=false;
		
		System.out.println(""+money + isTrue); 
				
		String name="Chen";
		int age=50;
		int iq=(age);
		
		System.out.println(age+""+iq);
		
	}		
}		
		
