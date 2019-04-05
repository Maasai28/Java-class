package com.class17;

public class NoMainMethod {
                                                   //methods and variables are member of the class
	                                               //For code to execute it has to find a MAIN method
                                                   //Without a main method code is not executable
	String str;       //data members             methods have to be in between a class body{" "}
	int num;
	
	void hello() {                    
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
	}
//---------------------------------------------------------------------------------------------------	
   public static void main(String[] args) {  // method signature
	
   NoMainMethod obj = new NoMainMethod();    //New method is being instantiated ( method body )
   obj.hello();                              //code is now executable, accessing(calling)method 'hello'
	obj.bye();	                             //calling method 'bye'

	}
void howAreYou() {
	System.out.println("How are you");
}
}
