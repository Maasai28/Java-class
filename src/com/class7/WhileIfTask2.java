package com.class7;

public class WhileIfTask2 {

	public static void main(String[] args) {
		/*Create boolean workDay = true
		 * Create int variable day = 1 
		 * Workday print "I need a day off" and increment day
		 * on day 6-->your condition for loop should become false
		 */
		
		boolean workDay = true;
		int day = 1;
		
		while (workDay) {
		    System.out.println("I need a day off");
		      if (day==6) {
		    System.out.println("I do not need a day off");	  
		    	  workDay = false;
		      }
		     day++; 
		
	} 
	}
}
