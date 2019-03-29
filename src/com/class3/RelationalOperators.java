package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 19;
		int b = 5;
		
		boolean result = a>b;
		boolean result1 = a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//compare 2 numbers - a is larger than b --> print
		
		if (a>b) {
			System.out.println("Hello");
			
		}else {
				System.out.println("Bye");
				
		//compare prices 
				 
				double shoePrice = 29.99;
				double allowedPrice = 31.99;
				
				if (shoePrice <= allowedPrice) {
					System.out.println("I'm buying the shoes");
					
				}else {
					System.out.println("I'm not buying the shoes");
				}
				
				
			}
		}

	}


