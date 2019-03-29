package com.class2;

import java.util.Scanner;

public class WorkingSpace {

	public static void main(String[] args) {
		String name = "Chen";
		Scanner scan = new Scanner(System.in);
		System.out.println("In:");
		
		name = scan.nextLine();
	    if (name.equals("Chen")) {
			System.out.println("teacher");
		}else {
			System.out.println("student");
			
		}
		
	}

}
 