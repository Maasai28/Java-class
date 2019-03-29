package com.class8;

public class ForLpTask1 {

	public static void main(String[] args) {
	//Print numbers 1 - 100
		for ( int i=1; i<=100; i++) {
			System.out.println(i);
		}
	//Print numbers 100 - 1
		for (int i = 100; i>=1; i--) {
			System.out.println(i);
		}
	//Print odd numbers 1 - 20 (2ways)
		for (int i = 1; i<=20; i+=2) {
			System.out.println(i); 
		}
	//Print odd numbers 1 - 20
		for (int i = 20; i>=0; i--) { 
			System.out.println(i);
		}
	//Print even numbers 20 - 1 (2ways)
		for (int i = 20; i>=0; i+=2) {
			System.out.println(i);
		}	
	//Print even numbers 20 - 1
		for (int i = 0; i<=20; i-=2) {
			System.out.println(i);
		}
	//Print even numbers 20 - 50 (2ways)
		for (int i = 20; i<=50; i+=2) {
			System.out.println(i);
		}
	//Print even numbers 20 - 50
		for (int i = 50; i >=20; i-=2) {
			System.out.println(i);
		}
	//Print even numbers 20 - 50
		for (int i = 20; i <50; i++) {      // This is the best second way
			if (i%2==0) {
				
			}
		}
    //Print odd numbers 20 - 50(2ways)
		for (int i = 21; i<=50; i+=2) {
			System.out.println(i);
		}
	//Print odd numbers 20 - 50
		for (int i = 49; i>=20; i-=2) {
			System.out.println(i);
		}
	}

}
