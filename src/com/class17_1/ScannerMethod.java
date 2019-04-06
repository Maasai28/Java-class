package com.class17_1;
import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		ScannerMethod demo = new ScannerMethod();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int a = scan.nextInt();
		System.out.println("Please enter number");
		int b = scan.nextInt();
		demo.sum(a, b);
		demo.sum(12, 13);
		demo.sum(100, 100);
		demo.sum1(a, b); //Scanner
		

	
	}
void sum(int x, int y) {          //Dynamic - takes parameters
	   System.out.println(x + y);
	  
   }
   void sub() {
	  int a=10, b=12; 
	  System.out.println(a - b);
   }
 int sum1 (int x, int y) {
	 System.out.println(x + y);
	 return x + y;
	 
 }
}
