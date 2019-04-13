package com.class22;

public class Car {

	public static String make = "Toyota";
	
	String color; // declaring instance variable
	String model;
	int doors;
	boolean engine;
	
	Car() {  // constructor  (you can use access modifiers on constructors)
		System.out.println("I am a constructor");  // if there is no constructor in a class the compiler
		System.out.println("Hello from constructor");//- automatically creates a default constructor
	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		
		hello();
	}
   public static void hello() {
	   //before using local variable we have to initialize
	   String name;
	  // System.out.println(name); compiler will give you an error
	   System.out.println("I am a static hello method");
	   
   }
}
