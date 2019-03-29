package com.JavaReview;

public class Review4Task2 {

	public static void main(String[] args) {
		/* Write a program that prints the string "The time is 07:min
		 * and then all the min till 7:30
		 */
   for (int t =0; t<=30; t++) {
	   if (t<10) {
	   System.out.println("The time is 07:" + "0" +t);
   }else {
	   System.out.println("The time is 07:" +t);
   }
	
	}
	int min = 0;
	while (min<=30) {
		if (min <10) {
			 System.out.println("The time is 07:" + "0" +min);	
		}else {
			 System.out.println("The time is 07:" +min);
		}
	min++;
	}
	int minute = 0;
	do {
		if (minute<10) {
			 System.out.println("The time is 07:" + "0" +minute);
		}else {
			 System.out.println("The time is 07:" +minute);
		}
	minute++;
	}while (minute<31);
	}
	}
