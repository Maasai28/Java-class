package com.class22;

public class SyntaxStudent {
	      //Write a program that will have a constructor: one with parameters and second without any parameters. 
	      //Create a separate Test class where you will execute both of the constructors.

	/* School name
	 * Batch name
	 * StudentName
	 * StudentLastName
	 * 
	 * method getStudentDetails
	 */
	
	static String schoolName = "Syntax";
	public static int batchNumber = 4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lastName) {
		studentName = name;
		studentLastName = lastName;
	}
	
	public void getStudentDetails() {
		String details = "I am a student at "+schoolName+" from batch "+batchNumber+
				" and my name is "+studentName+" "+studentLastName;
		System.out.println(details);
	}
}
