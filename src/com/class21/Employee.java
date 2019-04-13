package com.class21;

public class Employee {
       /* Create a Class called Employee:
		Create three  variables  eID , salary and set the CEO to “Sumair”
		Create two objects of the class Employee
		Set the value of eID, salary for each of the objects
		Print out the eID , salary and  CEO for each of the objects
        */
	static String CEO = "Sumair";
	int salary;
	long eID;
	
	public static void main(String[] args) {
		
		Employee student1 = new Employee();
		Employee student2 = new Employee();
		
		student1.eID=1234567l;
		student1.salary= 3000;
		
		student2.eID = 1234568l;
		student2.salary = 3500;
		
		

	}
      void printInfo() {
    	  System.out.println("The student's "+ eID + "" );
      }
      
}
