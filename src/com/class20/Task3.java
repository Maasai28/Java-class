package com.class20;

public class Task3 {
    /*Create a method that will take 1 parameter as a String and return reversed String.
     *  Method should be visibly only within same package.

     Create a method that will take a String and return whether String is palindrome or not. 
     Method should available to all classes within your projects.

     Create a method that will take a string and return array of words from that string. 
     Method should be available only within same class.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Task3 obj = new Task3();
      
	String reverse=obj.getReverse("Douglas is");
	System.out.println(reverse);
	}
    protected String getReverse(String Douglas) {
	String reverse = "";
	
	for (int i =Douglas.length()-1; i>=0; i--) {
		reverse+=Douglas.charAt(i);
	}
		return reverse;
	
}

}
