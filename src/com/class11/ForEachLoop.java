package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		
      int [] numbers = {12,13,14,15,16,17};
      
      for(int monkey:numbers) {
    	  System.out.print(monkey+ " ");
      }
    /*  Create an array of cars and store 6 elements into it. 
    Using 2 different loops print all values from the array.*/
	
	int [] cars = new int[6];
	for (int i = 0; i<cars.length; i++) {
		System.out.println(cars[i]);
	}
	for (int y : cars) {
		System.out.println(y);
	}
	/*Create an array of countries. While retrieving all values from an array print capital for each country.
	 *  (use 2 different loops).	
	 */
	
	String [] country = {"USA","Kenya","France","England"};
	for (int i=0; i<country.length; i++) {
		if(country[i].equals("USA")) {
			System.out.println("Washington");
		}else if (country[i].equals("Kenya")) {
			System.out.println("Nairobi");
		}else if (country[i].equals("France")) {
			System.out.println("Paris");
		}else if (country[i].equals("England")) {
			System.out.println("London");
		}
	}
	
	String [] countries = {"USA","Kenya","France","England"};
	String capital = null;
	for (int i = 0; i<countries.length; i++) {  
		String selectedCountry = countries[i];  // You have to use a variable to be able to switch countries
		switch (selectedCountry) {              //
		case "USA":
			capital="Washington";
			break;
		case "Kenya":
			capital="Nairobi";
			break;
		case "France":
			capital="Paris";
			break;
		case "England":
			capital="London";
			break;
			
		}
	System.out.println(capital);
	}
	//Create an array on integers and calculate the sum of all elements in an array.	
	int [] num = {1,2,3,4,5};
	int sum = 0;
	for (int i = 0; i< num.length; i++) {
		 sum = sum + num[i];
	}
	System.out.println(sum);
	
// ---------------------------using for each loop------------------------------------------
	int sum1 = 0;
	for (int num1:num) {
	sum1+=num1;	
	}
	System.out.println(sum1);
//----------------------------------------------------------------------------------------	
	int[][] arr = {{1,2,3},{10,20,30},{100,200,300}};
	// How many total arrays
	for (int i =0; i<arr.length; i++) {
		for(int j = 0; j<arr[i].length; j++) {
			System.out.print(arr[i][j]+ " ");
		}
	System.out.println();
	
	}
 System.out.println("-----------------for each loop--------------------------");	
	for ( int[] singleArray:arr) {     // -->single arrays
		for(int number:singleArray) {    //---> single numbers
			System.out.print(number+ " ");
		}
		System.out.println();
	}
//---------------------------------------------------------------------------------------------		
	/* Create a grocery list:fruits[},veggies{},dairy{]
	 * Retrieve all values using @ diff loops
	 */
	
	String[][] groceryList ={
		{"Apples","Bananas","Mangoes","Oranges"},
		{"Cucumber","lettuce","Broccolli"},
		{"Milk","Cheese","ice cream","Yogurt"}};
	for (int g =0; g<groceryList.length; g++) {
		for(int h = 0; h<groceryList[g].length; h++) {
			System.out.print(groceryList[g][h]+ " ");
		}
	System.out.println();
	}
//--------------------------------------------------------------------------------------------------	
	
	 System.out.println("-----------------for each loop--------------------------");	
		for ( String[] today:groceryList) {     // -->single arrays
			for(String tomrrow:today) {    //---> single numbers
				System.out.print(tomrrow+ " ");
			}
			System.out.println();
		}	
	
	
	
	
	
	
	}
}
