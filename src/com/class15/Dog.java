package com.class15;

public class Dog {
     
     
     /* create "Dog" class and create different objects of it:
     * husky
     * Bulldog
     * Labrador
     * with specific attributes and behaviors
     * push the code*/
     
	
	String breed, color;
	boolean bark;
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
	    dog1.breed = "Husky";
	    dog1.color = "Brown";
	    dog1.bark = true;
	    dog1.run();
	    dog1.swim();
	    dog1.strangers();
	
	System.out.println("-------2nd dog-----------------");
        Dog dog2 = new Dog();
  	    dog2.breed = "Bulldog";
	    dog2.color = "Black";
	    dog2.bark = true; 
	    dog2.run();
	    dog2.swim();
	    dog2.strangers();
	    
	    
	    
	 System.out.println("---------3rd-----------------");   
	 
	    Dog dog3 = new Dog();
	    dog3.breed = "Labrador";
	    dog3.color = "White";
	    dog3.bark = true;
	    dog3.run();
	    dog3.swim();
	    dog3.strangers();
	
	}	
     void run() {
    	 System.out.println("My "+color+" " +breed+ " likes to bark while running!");
     }
     void swim() {
    	 System.out.println("My "+color+" " +breed+ " likes to bark while swimming!");
     }
     void strangers() {
    	 System.out.println("My "+breed+ " only barks at strangers!");
     }
}

