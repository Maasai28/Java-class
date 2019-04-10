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
    static int min(int a, int b, int c) {
    int min = a;                   
	 if (b<a)  {
		 b = min;
		 }
		 if (c<min) {
			 c= min;                
		 	
		}
      return min;
      }
    

    static int max (int a, int b, int c) {
    	int max = a;
    	if (b>a) {
    		b=max;
    		}
    		if (c>max) {
    			c=max;
    		 }
    	
    	      return max;	
    	}
    }

	

