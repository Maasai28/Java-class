package com.class18;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		for (int i= 1; i<=3; i++) {
		for (int y = 1; y<=3; y++) {
				System.out.println(i + " " + y); //1 1, 1 2, 1 3 // 2 1, 2 2, 2 3 // 3 1, 3 2, 3 3
		}
		} // ------------------------------------------------------------------------------------
	//24 hours, 60 minutes
	
		for (int h = 0; h<24; h++) {
			for ( int m = 0; m<60; m++) {
				if (m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}
	//-----------------------------------------------------------------------------------------------------
	//Car mileage
		
		for (int a = 0; a<=9; a++) {
			for (int b = 0; b<=9; b++) {
				for (int c = 0; c<=9; c++) {
					for (int d =0; d<=9; d++) {
						System.out.println(a+""+b+""+c+""+d); // 0000,0001,0002...(remember to concatenate
					                                          //concatenate a+""+b+""+c+""d
					}
				}
			}
		}
	}

} 
 