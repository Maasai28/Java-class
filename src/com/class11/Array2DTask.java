package com.class11;

public class Array2DTask {

	public static void main(String[] args) {
	/*  Create a 2D array where you will store the following values:
	 *  Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
	    After storing values print the following:
		Mrs Smith, Mr Obama, Ms Jordan.		
     */
	
	String[][] name= {{"Mr", "Mrs", "Ms", "Miss"},{"Smith","Jordan","Jackson","Obama"}};
	System.out.println( name[0][1] + " " + name[1][0] );
	System.out.println( name[0][0] + " " + name[1][3] );
	System.out.println( name[0][2] + " " + name[1][1] );

	/*Create a 2D array that first row will contain 4 names and second row will contain grades.
	 *  Then you program should print name of the students that has as an A and B grade
	 */
	String[][]grade = {{"Mary","Jane","john","Smith"},{"A","B","C","D"}};
    System.out.println(grade[0][0] + " " + grade[1][0]);
	
	
	
	}

}
