package com.class12;

public class StringManipulations {

	public static void main(String[] args) {
	
		String str = "Syntax";
		System.out.println("-----------length of String");
		int lengthOfString = str.length();
		System.out.println(lengthOfString);
//------------------------------------------------------------------------
		System.out.println();
		String str1 = "Syntax Technologies";
		int lengthOf2String = str1.length();
		System.out.println(str1.length());
//-------------------------------------------------------------------
		System.out.println("---------length to uppercase and Lowercas---------------");
		String str3 = "Hello";
		String newString = str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString = newString.toLowerCase();
		System.out.println(lowerCaseString);
//-------------------------------------------------------------------------------------
		
		System.out.println("--------------comparing Strings------------------");
		String str4 ="Hello";
		String str5 = "hello";
		 boolean equality =str4.contentEquals(str5);
		 System.out.println(equality);
//------------------------------------------------------------------------------
		 System.out.println("--------comparing Strings and ignoring case sensitivity---------------");
		 
		 String expectedBrowser = "Chrome";
		 String actualBrowser = "chrome";
		 
		 
		 boolean equals = expectedBrowser.equalsIgnoreCase(actualBrowser);
		 System.out.println(equals);
		
	
	
	
	
	}

}
