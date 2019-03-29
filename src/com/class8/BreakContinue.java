package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		
   for (int i = 1; i<=10; i++) {
	   if (i ==5) {
		   break;
	   }
   System.out.println(i);
   }
  
   for (int g=0; g<=4; g++)	 {
	   System.out.println(g);   //executes once then break s
	   break;
   }
//--------------------------------------------------------------------------------------------	
	/*Allows you to jump into the next iteration inside the loop
	 * Mostly in the If condition
	 * Takes you out of the iteration
	 */
	for (int i=0; i<6; i++) {
		if (i==5) {
			continue;
		}
	System.out.println(i);
	}
	System.out.println("out of the loop");
//-------------------------------------------------------------------------------------------->
	//Print number 1 -20 skip those divisible by 3
	
	for (int a=1; a <=20; a++) {
		if (a%3==0) {
			continue;
		}
	System.out.println(a);
	
	}
	}
}
