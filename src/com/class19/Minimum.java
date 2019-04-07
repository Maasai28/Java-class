package com.class19;

public class Minimum {
	
	/*Create another class called Application
     from this application class create 3 diffrent instances/objects of it
     and print the properties and functions/methods*/
	
	
	//int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	static int minOfValues(int [] arr) {
		int min =0;
		for (int y:arr) {
			if(y<min) {
				min = y;
			}
		}
		return min;
	}
 static int maxOfValues(int [] array) {
//     Write a program to find the maximum and minimum value of an array.
     
//    int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    int max = array[0];
    int min = array[0];

    for (int j = 0; j < array.length; j++) {

        if (array[j] >= max) {

            max = array[j];
        }
        if (array[j] <= min) {
            min = array[j];
        }

    }
      return max;
 }
  
 void print() {
	 int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
	 System.out.println(minOfValues(my_array)); // needs a main method to print
	 System.out.println(maxOfValues(array));    // needs a main method to print
 }

}
