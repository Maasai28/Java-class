package com.class17;

public class Greetings {
	
	public static void main(String[] args) {
	
		Greetings obj = new Greetings();
		obj.hello();
		//to find largest number
		obj.findLargest(20,10);  //calling method FinfLargest and passing values
		obj.findLargest(2000, 66464);  //calling method FindLargest and passing values (Reusing method)
		obj.helloToInstructor("Awet");
		obj.helloToInstructor("Arif"); //Reusing method helloToInstructor
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
		
		
	}
   void hello() {    // Method without parameters 
		System.out.println("Hello"); //method body
   }
   void helloToInstructor(String name)	{   // Method with 1 parameters
		System.out.println("Hello "+name);
	
	}
	void findLargest(int a, int b) { //Method signature - with 2 parameters
		//int a=10;
		//int b=20;
		
		if(a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}
}
}