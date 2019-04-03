package com.class14;

public class StringManipulation1 {

	public static void main(String[] args) {
		// ToCharArray
		
		String str = "saturday";
		char[] array = str.toCharArray();
		for (int i = 0; i <array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("----------for each loop-----------------");
       for (char t:array) {
	    System.out.print(t +" ");
       }   
        System.out.println("Printing in reverse");
	    for (int i =array.length-1; i>=0; i--) {
		System.out.print(array[i] + " ");
	}
	
	// Reverse a String Without using a reverse function
	//First method using toCharArray
	    System.out.println("--------------------------------");
	  String original = "Today is Java Class";
	  String reverse = "";
	  char [] array1 = original.toCharArray();
	  for (int i = array1.length-1; i>=0; i--) {
		  reverse = reverse + array1[i]; //"+s+s+a+l+C...
	  }  
	  System.out.println("Reversed String is: "+reverse+ " ");
	  
	  //Second method
	  System.out.println("========================");
	  String reverse1 ="";
	  for (int i = original.length()-1; i>=0; i--) {
		  reverse1 = reverse1 + original.charAt(i);
	  }
		  System.out.println("Reversed String is: "+reverse1+ " ");
	  
	  System.out.println("================");
	String reverse2 = "";
	for (int i = original.length(); i>0; i--) {
		reverse2 +=  original.substring(i-1, i);
		
	}
	 System.out.println("Reversed String is: "+reverse2 + " ");
	}

}
