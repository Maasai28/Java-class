package com.class16;

import java.util.Scanner;

public class review {
	
	//
	
      String word, weqas;
      String str = "Syntax Technologies";
      String reverse ="";
      
      public static void main(String[] args) {
		review weqas = new review();
    	  review word = new review();
    	  review str = new review();
    	  str.ReverseString();
    	  word.noReturn();
    	  weqas.scannerFirstName();
    	  weqas.scannerInt();
    	  
      }			  
   void noReturn() {
	   System.out.println("I do not have a return type");
   }
   void scannerFirstName() {
	   Scanner scan = new Scanner(System.in);
	   scan.nextLine();
   }
   void scannerInt() {
	   Scanner scan = new Scanner(System.in); 
	   scan.nextInt();
   }
   void ReverseString( ) {
	   for (int i =str.length()-1; i>=0; i--) {
		   reverse+=str.charAt(i);
		   
	   }
	   System.out.println(reverse);
   }

}
