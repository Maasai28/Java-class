package com.class14;

public class StringManipulationSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "Welcome to Syntax Students Batch 4";
    String [] array = str.split("S");
    System.out.println(array.length);
	
    for (String substring:array) {
		System.out.println(substring);
	}
	System.out.println("------------------------------------------");
	String str1 = "Welcome to Syntax Students Batch four";
	String [] arr = str1.split(" ");
	System.out.println(arr.length);
	System.out.println("Find out the number of words");
	for (String sub: arr) {
		System.out.println(sub);
	}
	}

}
