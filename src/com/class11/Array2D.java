package com.class11;

public class Array2D {

	public static void main(String[] args) {
		// Creating 2D aray
		
		int[][] d = new int [3][4];  // 12 elements
		//row 1
		d[0][0] = 12;
		d[0][1] = 13;
		d[0][2] = 14;
		d[0][3] = 15;
       //row2
		d[1][0] = 1;
		d[1][1] = 2;
		d[1][2] = 3;
		d[1][3] = 4;
	   //row3
		d[2][0] = 5;
		d[2][1] = 10;
		d[2][2] = 15;
		d[2][3] = 20;	
	   
		System.out.println(d[1][2]); //3
		System.out.println(d[2][3]); //20
		
		int[][] c = {
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20}
				};
	System.out.println(c[0][0]);  //12
	
	String[][] groups = {
			      {"Jawid","Mustafa","Amina","Mahn","Emily","Ahmad"},
			      {"Valeriia","Liza","Douglas","Ryan","Kasu"}
	               };
	System.out.println(groups[1][2]);
	
	
	
	
	}

}
