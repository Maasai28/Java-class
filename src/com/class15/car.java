package com.class15;

public class car {

	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		// ClasssName variableName = new ClassName
		//1st object
		
		car car1 = new car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.door = 4;
		car1.wheels = 4;
		//Q. car Honda has 4 wheels
		System.out.println("car " +car1.make+" has " +car1.wheels+ " wheels");
		System.out.println(car1.make);
		// Q.define behavior
		        car1.drive();
		        car1.stop();
		        car1.reverse();
		
		//2nd object
		
		car car2 = new car();
		car2.make = "Tesla";
		car2.model = "X";
		car2.color = "Blue";
		car2.door = 4;
		car2.wheels = 4;
		//q>My car is blue Tesla
		System.out.println("My car is " +car2.color+" "+car2.make);
		// Q.define Behavior
				car2.drive();
				car2.stop();
				car2.reverse();
					}
	// Creating a method
	
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void stop() {
		System.out.println("Car can stop");
	}
}
