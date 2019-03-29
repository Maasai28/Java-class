package com.class5;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		/* ask user enter price and boolean value for sale
		 * Based on sale find price
		 * if price<20 apply 20%discount
		 * if price>20 and <100 apply 30%
		 * if price >100 and <500 apply 50%
		 */
         Scanner scan;
         boolean sale;
         int discount; 
         int price;
         double finalPrice;
         
         scan = new Scanner(System.in);
         System.out.println("Please enter if there is a sale");
         sale = scan.nextBoolean();
         
         System.out.println("Please enter price of the item");
         price = scan.nextInt();
         
         if (sale) {
        	 System.out.println("Lets check all discounts");
        	 if (price<20) {
        		 discount = 20;
        		 finalPrice = price-(price*0.2);
             }else if (price>=20 && price<100) {
            	 discount = 30;
            	 finalPrice = price-(price*0.3);
             }else if (price>=100 && price<500) {
            	 discount = 50;
            	 finalPrice = price-(price*0.5);
             }else {
            	 discount = 75;
            	 finalPrice = price-(price*0.75);
             }
            	 System.out.println("Final price is " + finalPrice);
             
	    }else{
        	System.out.println("Not interested");
        	
            			 
        	 }
         }
	}


