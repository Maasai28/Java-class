package com.class11;

public class Arrayarecap {

	public static void main(String[] args) {
		//Create an array of names that will hold 5 elements and retrieve all values.
      String [] names = new String[7];
      names[0] = "Asel";
      names[1] = "Awet";
      names[2] = "Arif";
      names[3] = "Weqas";
      names[4] = "Dzmitri";
      names[5] = "shiva";
      names[6] = "Sandesh";
      
      for(int i = 0; i<names.length; i++) {
    	  System.out.println(names[i]);
      } 
      
   //Create an array using array literal   
    
      String [] studentNames = {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
      System.out.println("--------------for loop----------------");
      for(int i = 0; i<=studentNames.length-1; i++) {
    	  System.out.println(studentNames[i]);
      }
	
   // Retrieve values using: advanced for loop ( for each loop, enhanced for loop )
      System.out.println("-----------------Advanced for loop----------------------");
      for(String student:studentNames) {    //each element from the array studentNames is assigned to the
    	  System.out.println(student);      //variable student
      }
	
	}

}
