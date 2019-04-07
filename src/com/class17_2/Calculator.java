package com.class17_2;

 class Calculator {   //Access to class can only be public or default

	public static void main(String[] args) {
		
		
		Application obj = new Application();
		obj.sum(30, 10);
		Calculator obj1 = new Calculator();
		
		
		
		

	}
  void example() {
	  System.out.println("No return value no parameters");
  }
  void example2(String name) {
	  System.out.println("No return value no parameters: " + name);
	
}
  boolean example3() {
	  System.out.println("with return value and parameters");
	  return true;
}
  String example4(String name) {
	  System.out.println("with return value and parameters");
	  return name;
}
  boolean example5(String name) {
	  System.out.println("No return value with parameters:" +name);
	  return false;
}
  char example6(char name) {
	  System.out.println("With return value and Parameters");
	  return name;
  }
}  
  
  
  