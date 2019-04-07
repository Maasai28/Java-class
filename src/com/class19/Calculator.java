package com.class19;

public class Calculator {
  /* Have methods that take 3 inputs and return results
   * of sum, average, min max
   */
	
	static int sum(int a, int b, int c) {
			System.out.println(a + b + c);
			return a+b+c;
		}
	static int average(int a, int b, int c) {
		System.out.println((a+b+c)/3);
		return (a+b+c)/3;
	}
    static int min(int [] arr) {
    int min =0;                     // int min =a
	for (int y:arr) {               // if(b<a) b=min
		if(y<min) {                 // if(c<min c= min
			min = y;
		}
	}
	return min;
}
    static int max(int [] array) {
    	int max = 0;                 //int max =a
    	for (int j : array) {         //if(b>a b= max
    		 if (array[j] >= max) {   // if c>max c= max

    	            max = array[j];
    	       
    	        }

    	    }
    	      return max;	
    	}
    }
	
	

