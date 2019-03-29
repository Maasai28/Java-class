package com.class10;

public class ArrayTask {

	public static void main(String[] args) {
/*1.Create an array of chars and store grades into it: A,B,C,D,E,F.
 *  Then print a grade B (use 2 different ways of creating an array).
 */
    char [] array1;
   
    
    array1 = new char[6];
    
    array1 [0] = 'A';
    array1 [1] = 'B';
    array1 [2] = 'C';
    array1 [3] = 'D';
    array1 [4] = 'E';
    array1 [5] = 'F';
    
    System.out.println(array1[1]);
    
/*Create an array of names and store all names of your group. 
 * Then print your name from that array. (use 2 different ways of creating an array).
 */
   String [] j  = new String[5];
   
      j[0] = "Douglas";
      j[1] = "Valeriia";
      j[2] = "Liza";
      j[3] = "Ryan";
      j[4] = "Kasu";
      
    System.out.println(j[0]);
    
 /*3.Create an array of words: Java, Saturday, day, coding, is.
  *  Print the following sentence using element of array: “Saturday is Java coding Day”.   
  */
    
    String [] s = new String[5];
       s[0] = "Saturday";
       s[1] = "is";
       s[2] = "Java";
       s[3] = "coding";
       s[4] = "Day";
       
       System.out.println(s[0]+" "+ s[1] +" "+ s[2] +" "+ s[3] +" "+ s[4]);
       
       int size = s.length;
       
       System.out.println("The size of an array is " + size);
	}

}
