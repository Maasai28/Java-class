package com.class12;

import java.util.Scanner;

public class StringManipulationTask {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. Password cannot contain username if so, →
		 * message=”Password cannot contain username”. Password should match confirmed
		 * password, if not → message “Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */

		Scanner scan = new Scanner(System.in);
		String username;
		String password;
		String confirmPassword;
//	int size = password.length();
//	size = 8;

		System.out.println("Please enter Username");
		username = scan.nextLine();

		System.out.println("Please enter your password");
		password = scan.nextLine();

		System.out.println("Please enter your confirm  password");
		confirmPassword = scan.nextLine();

//	boolean isEmpty = username.isEmpty();
//	System.out.println(isEmpty);

		if (!(username.isEmpty() && password.isEmpty() && confirmPassword.isEmpty())) {
			if (password.length() > 8) {
				if (!password.contains(username)) {
					if (password.equals(username)) {
						System.out.println("Your username and password has been created");

					} else {
						System.out.println("Password do not much");
					}

				} else {
					System.out.println("Passwword cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Please enter your Username and Password");

		}

	}

}
