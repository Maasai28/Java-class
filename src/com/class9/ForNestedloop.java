package com.class9;

public class ForNestedloop {

	public static void main(String[] args) {
		
for (int i = 0; i<3; i++) {  // --outer loop
	for (int y = 0; y<4; y++) {  //--inner loop
	System.out.println("I am inner loop " + y);
}
      System.out.println("----I am outer loop---- " + i); //3
}
	
	

//-----------------------------------------------------------------------------	
	//patterns

	
	/* printing patterns
	 * 12345---->4 rows & 5 columns
	 * 12345
	 * 12345
	 * 12345
	 */
	for (int i =0; i<5; i++) {
		for (int y =1; y<6; y++) {
			System.out.print(y); //12345
		}
          // System.out.println();  //println creates a new line (row)
	}
	/* 1111111
	 * 2222222
	 * 3333333
	 * 4444444
	 * 5555555
	 * 6666666
	 * 7777777 
	 */
	for (int i = 1; i<=7; i++) {
		for (int y =1; y<=7; y++) {
			System.out.print(i);  //1111111 // 2222222
		}
	     System.out.println();
	}
	/*   *****  row 4 columns 5
	 *   *****
	 *   *****
	 *   *****
	 */
	for (int a = 0; a<4; a++) {
		for (int b = 0; b<5; b++) {
			System.out.print("*");
		}
	    System.out.println();
	}
	 /* 54321
	  * 54321
	  * 54321
	  * 54321
	  */
	for (int i =4; i>0; i--) {
		for (int y=5; y>0; y--) {
			System.out.print(i);
		}
	System.out.println();
	}
	
	}
}
