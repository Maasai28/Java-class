package com.class8;

import java.util.Scanner;

public class RangeTask {

	public static void main(String[] args) {
		/*Let user define a range of numbers
		 *   
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting number");
        int startNumber = scan.nextInt();
        
        System.out.println("Enter last number");
        int endNumber = scan.nextInt();
        
        for ( int i=startNumber; i<=endNumber; i++) {
        	System.out.println(i);
        }
	}

}
 