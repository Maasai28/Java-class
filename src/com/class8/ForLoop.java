package com.class8;

public class ForLoop {

	public static void main(String[] args) {
       /*initialize; condition/test condition; increment/decrement
        * Use when you already know the number of loops
        */
		
		for (int i=0; i<=5; i++) {
			System.out.println("Good morning");
		}
      // Print numbers 10 to 1	
	    for ( int i=10; i>1; i--) {
	    	System.out.println(i);
	    }
	// What is the output?
	    for ( int a=0; a<=20; a+=2) {
	    	System.out.println(a);   // even numbers between 0 - 20
	    }
	// 
	    for ( int b=1; b<=50; b+=5) {
	    	System.out.println(b);   // numbers 1 -50 increment by 5
	    }
	}
}
  

