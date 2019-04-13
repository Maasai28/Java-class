package com.class20;

public class Task1 {

	public static void main(String[] args) {
	/*create a method createEmail().
	 * provide users name, last name and email
	 * return complete email address
	 */
		
	Task1 obj = new Task1();
	String email=obj.createEmail("Jon", "Snow", "gmail");
	System.out.println(email.toLowerCase());
	
	obj.createEmail("Bob", "Snow", "outlook");
	System.out.println(email);
	obj.sayHello();
		
}
	//return type methodName
 String createEmail(String userName, String lastName, String emailType) {
	 String email= userName+lastName+"@"+emailType+" .com";
	 return email.toLowerCase();
 }
	
void sayHello()	{
	
}
}
