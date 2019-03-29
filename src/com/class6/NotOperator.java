package com.class6;

public class NotOperator {

	public static void main(String[] args) {
		/* 
		 * NOT operator !
		 * Reverses a conditon
		 */
		boolean a =! true;
		System.out.println("The value of boolean variable is " + a );
        
		boolean snow = true;
		// if snow I'll go to class
		
		if (snow) { 
			System.out.println("I will stay home");
			
		}
	    int x = 10;
	    int y = 20;
	    
	    if (!(x>y)) {
	    	System.out.println("Hello");
	    }
	}

}
