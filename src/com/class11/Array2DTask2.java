package com.class11;

public class Array2DTask2 {

	public static void main(String[] args) {
	/*Create arrray of cars: American,German,Korean,Italian
	 * Retrieve all vallues
	 */
		

	
	String[][] cars ={
		{"Ford", "Lincoln","Chevrolet","Mustang"},
		{"BMW","Mercedes"},
		{"Hyundai","Kia","Daewoo"},
		{"Lambourgani","Fiat","Porche"},
	    };
	
	for (int i = 0; i<cars.length; i++) {
		for (int y = 0; y<cars[i].length; y++) {
			System.out.print(cars[i][y] + " ");
		}
	System.out.println();
	}
	
//Create an array of countries: North Anerican, European, Asian, African
	
	String [][] country = {
			{"USA","Canada"},
			{"France","Germany","Spain","Italy"},
			{"China","Korea","Japan","Vietnam","Philipines"},
			{"Kenya","Uganda","Tanzania","Rwanda"}
	        };
	
	for (int i = 0; i<country.length; i++) {
		for (int y = 0; y<country[i].length; y++) {
			System.out.print(country[i][y] + " ");
		}
	System.out.println();
	}
	}
}
