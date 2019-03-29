package com.JavaReview;

import java.util.regex.Pattern;

public class Review5 {

/*	1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    3 6 9 12 15 18 21 24 27 30
    4 8 12 16 20 24 28 32 36 40
    5 10 15 20 25 30 35 40 45 50
	*/
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    for (int i =0; i<=10; i++) {
//    	System.out.print(i + " ");
//    	for ( int y = 2; i<=20; y+=2) {
//    		System.out.print(y + " ");                  THIS HAS  TOO MANT LOOPS
//    		for (int a=3; a<=30; a+=3) {
//    			System.out.print(a + " ");}
//    			for ( int b = 4; b<=40; b+=4) {
//    				 System.out.print(b + " ");
//    				for ( int c = 5; c<=50; c+=5) {
//    					System.out.print(c + " ");	
//    		
//	}
//
       for (int i =1; i<=5; i++) {
    	   for(int y=1; y<=10; y++) {
    		   System.out.print(i*y + " ");
    	   }
            System.out.println();
       }
	
/*	Write a program that prints the Pattern
	
	....1                                    1 to 5
	...22                                    1 to 5 - i
	..333                                    1 to i
	.4444
	55555
	*/
       
       for (int i = 1; i <=5; i++) {
    	   for (int y = 5; y>0; y--) {
    		 
    		   if (i<y) {
    			   System.out.print(".");
    		   }else {
    			   System.out.print(i);
    		   }
    	   System.out.println();
    	   }
    	   
       }
	
	for (int i=1; i<=5; i++) {
		for (int k = 1; k<=(5-i); k++) {
			System.out.print("'");
		}
		for (int m =1; m <=i; m++) {
	System.out.print(i);
	}
	System.out.println();
	}
/*	
	* Write a program that prints the following pattern
    *
....1
...2
..3
.4
5	
*/	
	
	for ( int i =1; i<=5; i++) {
		for (int y =1; y<=(5-i); y++) {
			System.out.print(".");
	}
	System.out.print(i);
	}
	System.out.println();
	
	
	
	}
}
	
	
	
	
	
	
	
	
