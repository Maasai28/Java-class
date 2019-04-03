package com.class14;

public class StringTask {

	public static void main(String[] args) {
		/* Create a String that will hold a sentence.
		 * Write a program to get a new string without spaces
		 */
String str = "It's the weekend";
String rep = str.replaceAll(" ", "");
System.out.println(rep);
	
	/*Create a String that should be combination of letters, numbers and special characters. 
	 * Find out how many alpha characters are there in the String.
	 */
String str1 = "1234 is the number of ABCD??";
char [] array = str1.toCharArray();
for (int i =0; i<array.length; i++) {
	System.out.print(array[i] + " ");
}
    /*You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
     *How would you find out how many sentences are in that String?
     */
          String a = "Is it saturday? Is it raining? Do we have a Java Class today?"; 
          String [] arr = a.split("[?] ");
          System.out.println(arr.length);
        		  
	}

}
