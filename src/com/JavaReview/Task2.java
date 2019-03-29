package com.JavaReview;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*2. Ask user to enter the item they want to buy and  the price for the item.
		 *  Then ask user to pay for it. Every time user enters money accumulate the amount and tell user 
		 *  how much is left to pay off the amount. Whenever user done with payments tell them
		 *   "Thank you for shopping!"
		 *   
		 *   scanner will take input from user
		 *   item=first input from user
		 *   price=second input from user
		 *   
		 *   money=continues input from user
		 *   total=
		 *   loop until total matches the price
//		 */
//	Scanner scan;
//	String item;
//	double price,money; double change = 0;
//	double sum = 0;
//	scan = new Scanner(System.in);
	
//	System.out.println("Please enter the item you would like to buy");
//	item = scan.nextLine();
//	
//	System.out.println("Please enter the price of the item");
//	price = scan.nextDouble();
//	do {
//		System.out.println("Please pay for the item");
//	    money = scan.nextDouble();
//	    sum = sum + money;
//	    System.out.println("You need to pay" + (price-sum));
//	
//	}while (sum <price);
//	System.out.println("Thank you for shopping with us");
//	
//-----------------------------------------------------------------------------------	
	Scanner scan = new Scanner(System.in);
	String item;
	double totalPayment = 0;
	double balance;
	double price;	
	double payment;	
	double change;	
		System.out.println("Please enter your item");
	item = scan.next();
	
	System.out.println("Please enter the item price");
	price = scan.nextInt();
	
	do {
		System.out.println("Please enter your paymet amount");
		payment = scan.nextDouble();
		
		totalPayment = totalPayment + payment;
		balance = price - totalPayment;
		if (totalPayment>price) {
			change = totalPayment - price;
			System.out.println("Please take your change " +change);
			break;
		}else if (totalPayment<price) {
			balance = price - totalPayment;
			System.out.println("Please enter more money $" + balance);
		}
		System.out.println("Please enter more $"+balance);
	}while (totalPayment!=price);
	System.out.println("Thank you for shopping");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

	


