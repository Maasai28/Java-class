package com.class8;

public class SumForLoop {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
// Find sum of even numbers 1- 100
		int sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 = sum2 + i;
		}
	}
}
 