package com.interVie;

public class QuestionsReviewed {

	public static void main(String[] args) {
		/* . Write a program to swap 2 numbers without a temporary variable?
	       Swap  2 strings without a temporary variable?*/

		int a =10;
		int b =20;
		
		a = a + b;  //30
		b = a - b;  //30-20
		a = a - b;  //30-10
	System.out.println("The value of a=" +a+ " value of  b=" +b);
	
	String str1 ="Hello";   //5
	String str2 = "World";  //5
	str1 = str1+str2;  //HelloWorld--->10
	str2 = str1.substring(0,str1.length()-str2.length()); //Hello
	str1 = str1.substring(str2.length());
	
	System.out.println("The value of str1="  +str1+ " value of str2 ="  +str2);
	
	/*Write a java program to find the second largest number in the array? 
	 *Maximum and minimum number in the array?
	 */
	
	int arr[] = {144,46,0,86,292,-1};
	
	int min =0; //144
	int secondLargest = 0; //144
	int largest = 0; //144
	
	for ( int c : arr) {
		if (c >largest) {
			largest = c;
		}
	    if (c <min) {
	    	min = c;
	}
	}
	for (int c : arr) {
		if (c >secondLargest && c < largest) {
		secondLargest = c;
	}
	}	
	System.out.println("min = " +min);
	System.out.println("second Largest = " + secondLargest);
	System.out.println("The Largest = " + largest);
	
	// Write a java program to reverse String? Reverse a string word by word?
	String sentence = "The maste is speaking";
	String reverse="";
	for (int i = sentence.length()-1; i>0; i--) {
		reverse = reverse+sentence.charAt(i);
	}
	String[] words = reverse.split(" ");
	for (int i = words.length-1; i>=0; i--){
	
	System.out.println(words[i]);
	}
	
	/* Finding prime number
	boolean prime = true;
	for (int i =2; i < number; i++) {
		if (number%i!=0) {
			
		}else {
			prime= false;
			break;
		}
	}*/
	
	}
}
