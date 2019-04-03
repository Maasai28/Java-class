package com.class15;

public class Phone {
	
	String screen,volume,brand;
	int memory;
	boolean homeButton, camera;

	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.brand = "iphone";
		phone1.screen = "Black";
		phone1.volume = "SideButton";
		phone1.memory = 16;
		phone1.homeButton = true;
		phone1.camera = true;
		
		phone1.call();
		phone1.picture();
		phone1.volume();
		
		
		Phone phone2 = new Phone();
		phone2.brand = "Android";
		phone2.screen = "Green";
		phone2.volume = "SideButton";
		phone2.memory = 16;
		phone2.homeButton = true;
		phone2.camera = true;
		
		phone2.call();
		phone2.picture();
		phone2.volume();
		
	
	
	
	
	
	
	
	
	
	
	}
	void call() {
		System.out.println("I can make a call using my "+brand);
	}
	
	void picture() {
		System.out.println("I can take a screenshot using my "+brand);
	}
	
	void volume() {
		System.out.println("I can add volume using my "+brand);
	}
	
}
