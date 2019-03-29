package com.class12;

import java.util.Scanner;

public class StringManipulationTaskAgain {

	public static void main(String[] args) {
		Scanner scan;
		String userName, passWord, confirmedPassword;
		
		scan =new Scanner(System.in);
		System.out.println("Please enter your username");
		userName = scan.nextLine();
		
		System.out.println("Please enter password");
		passWord = scan.nextLine();
		
		System.out.println("Please confirm password");
		confirmedPassword = scan.nextLine();
		
		if (!(userName.isEmpty() && passWord.isEmpty())) {
			if (passWord.length()>8) {
				if (!passWord.contains(userName)) {
					if (passWord.equals(confirmedPassword)) {
						System.out.println("Your username and Password has been created");
					}else {
						System.out.println("Your passwords do not much");
					}
					
				}else {
					System.out.println("Password cannot contain username");
				}
				
			}else {
				System.out.println("Password is too short");
			}
				
			
		}else {
			System.out.println("Username and password cannot be empty");
		}
		

	
	}

}
