package com.class9;

public class ForPatterns {

	public static void main(String[] args) {
		/*   *          rows=4  
		 *   **         columns <= rows
		 *   ***
		 *   ****
		 */
for (int i =0; i<4; i++) {
	for (int y=0; y<=i; y++) {
		System.out.print("*");
	}
System.out.println();
}
	/* ******          rows=5 columns=6
	 * *    *           
	 * *    *           columns Print only if row =1 or 4
	 * ******                               col = 1 or 6
	 */
	
	for (int i =1; i<=4; i++) {
		for (int y = 1; y<=6; y++) {
			
		if (i==1 || i==4 || y==1|| y==6) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		}
		System.out.println();
	}
	}

}
