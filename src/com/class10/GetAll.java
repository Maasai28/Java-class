package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		String[] names = {"John", "Mike", "Jane", "Talgat", "olga", "Mehmet", "Siyar"};
		
		int a = 3;
		System.out.println(names[a]);  //Talgat
		
		a+=2;
		System.out.println(names[a]); //Mehmet
		
		a-=4;
		System.out.println(names[a]); //Mike
		
		// Using loop to eliminate repitition
		
		int size = names.length;
		
		for (int i = 0; i<size; i++) {
			
			System.out.println(names[i]);
		}
//----------------------------------------------------------------------------------------------------		
	
		             //   0    1    2   3    4     5
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'}; // size is 6 = grades.lenght (length-1)
	
	for ( int i = 0; i <=grades.length-1; i++) {
		
		System.out.print(grades[i]);
	}
		
	}

}
