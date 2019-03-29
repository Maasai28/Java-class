package com.class7;

public class Loops {

	public static void main(String[] args) {
/* To eliminate repetition we use loops
 * Loops in java: while, do while, for
 * Enhanced for loop--->collections or arrays*/		
boolean morning = true;
 int a = 1;
 while (a<5) {
	 System.out.println("Good moring");
	 a++; 
 } 
		
		int b = 1;
		while (b<=5) {
			System.out.println("I'm inside a while loop");
			b++;
		}
            System.out.println("I'm outside of while loop");
         
            // print values from 10 to 20 inclusive   
            
            int z = 10;
            while (z<=20) {
            	System.out.println(z);
            	z++;
            }
	//print values 1-20 all in one line with space
            
            int q = 1;
            while (q<=20) {
            	System.out.print(q + " ");
            	q++;
            }      	
     //print values 10 to 1
            	
            	int e = 10;
            	while (e>=1) {
            		System.out.println(e);
            		e--;
            	
            }
	}

}
