package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		/*post increment a++, postdecrement a--
		 * 
		 */
		 
		int z = 1; 
		z++;
		System.out.println(z);//2
		
		int v = 10;
		v--;
		System.out.println(v);//9
		
		int a = 10;
		int b = ++a;// preincrement --->assign
		System.out.println("The value of a: " + a);
		System.out.println("The value of b: " +b);
		
		int c = 10;
		int d = c++;// postincrement ---> assign---->increment
	    System.out.println("The value of c: " + c);//11
		System.out.println("The value of d: " +d);//10
		
		int q = 100;
		int e = q--;
		System.out.println("The value of q: " + q);
		System.out.println("The value of e: " + e);
		
		int h = 50;
		int g = --h; //decrement then assign
		System.out.println("The value of g: " + g);
		System.out.println("The value of h: " + h);
	}

}
