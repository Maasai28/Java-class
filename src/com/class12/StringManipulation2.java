package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String str = "Good morning, students";
		boolean contains = str.contains("morning");  //
		System.out.println(contains);
		
		String present = "Welcome, Douglas";
		boolean flag = present.contains("Welcome,");
		System.out.println(flag);
		
		boolean flag1 = present.toLowerCase().contains(present);
		System.out.println(flag1);
		
		//endsWith and startsWith ---> character at the start and end
		
		String str1 = "Syntax";
		boolean starts = str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("y"));
		
		System.out.println(str1.endsWith("x"));
		
		
		//isEmpty() if length of string = 0
		
		String str2 = "";
		boolean isEmpty = str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat operotor------------------------------------------------------
		
		System.out.println("--------concat()------");
		
		String str3 = "Hi";
		String str4 = "Douglas";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
//----------------------------------------------------------------------------		
// trim will remove spaces at the beginning and at the end of your string
		
		System.out.println("-------comparing and trim strings-------");
		String expected = "Hi Douglas";
		String actual = " Hi Douglas ";
		
		actual = actual.trim();
		System.out.println(expected.equals(expected));
		
				
		
		
		
		
	
	
	
	
	
	
	}
}