package com.JavaReview;

public class Review4Task1 {

	public static void main(String[] args) {
		int [][] rating	= {
                {2,6,9,3},
                {1,7,9,4,8},
	            {0,4,6,2,5},
	            {0,1,2,3},

                  };
	int count = 0;
	
	for(int[] inner:rating) {
		for(int element: inner) {
			
			if(element>7) {
				count++;
			}
		}
	}
System.out.println("The number of all elements above 7 is " + count);
// program to find average values of 3rd column
int sum=0;
//for (int col3 = 0; col3 < rating.length; col3++) {
//	sum+=rating[col3][2];
//	}
//System.out.println(sum/4);

for(int i = 0; i <rating.length; i++) {
	sum+=rating[i][2];
	
}
System.out.println(sum/rating.length);

}
}
		
		
		
	


