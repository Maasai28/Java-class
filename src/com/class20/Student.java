package com.class20;

public class Student {

	public static void main(String[] args) {
		/* create lass Student that will have a method getGrade
		 * score >90 - A, >80 - B, >70 - C, >50 - D, else F
		 */
	 Student obj = new Student();
	 char myGrade = obj.getGrade(91);
	 System.out.println("My grade at Syntax is "+myGrade);
	 

	}
char getGrade( int score) {
	char grade;
	if (score>90) {
		return 'A';
	}else if(score>80) {
			return 'B';
	}else if (score>70)	{
		return 'C';
	}else if (score>60)	{
		return 'D';
	}else {
		return 'F';
	}
	
		

}

}
