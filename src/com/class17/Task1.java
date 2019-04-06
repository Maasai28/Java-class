package com.class17;

public class Task1 {

	public static void main(String[] args) {
		/*Create a method that will take 2 parameters as a numbers 
		 * and prints which number is larger.
		 */
		String str = "madam";  
		String str1 = "mommy";
		Task1 obj = new Task1();
	//----------1---------------------
		obj.evenOdd(4);
	//-----------2-----------------------
		obj.isPalindrome(str);
		obj.isPalindrome(str1);
	//----------3------------------------	
		obj.isLargest(25, 567);
		
	}
    void evenOdd(int num) {
    	if (num%2==0) {
    		System.out.println(num+ " is even");
    	}else {
    		System.out.println(num+ " is odd");
    	}
      /*Create a method that will take a number and prints 
       * whether the number is even or odd.
       */
    
    }
   void isPalindrome(String str) {
	   String reverse="";
	   for (int i = str.length()-1; i>=0; i--) {
		   reverse += str.charAt(i);
	   }
     if (reverse.equals(str)) {
    	 System.out.println(str+ " is a palindrome");
     }else {
    	 System.out.println(str+ " is not a palindrome");
     }
  }
    /*Create a method that will take 2 parameters as a numbers and 
     * prints which number is larger.
     */
   void isLargest(int a, int b) {
	   if (a>b) {
		   System.out.println(a+ " is largest number");
	   }else {
		   System.out.println(b+ " is largest number");
	   }
	   
   }

}
