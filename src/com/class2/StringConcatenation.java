package com.class2;

public class StringConcatenation {
	
	public static void  main(String[] args) {
    String name="Douglas";
	String lastName="Ominde";
	char grade='B';
	String city="Germantown";
	long phoneNumber=2405509130l;
	
	System.out.println("My name is "+name);
	System.out.println("I am a "+grade   + " student");
	System.out.println("I live in the city of "+city);
	System.out.println("My phone number is " +phoneNumber);
	
    float ed=8.2f;
    float mult=ed*ed;
    
    System.out.println(mult);
    System.out.println("The multiplication of "+ed + " by itself is " + mult);
    
    int x = 10;
    int y = 20;
    
    String a = "Hello"; 
    String b = "Bye";
    
    System.out.println(x+y+a+b); //30HelloBye
    System.out.println(x+a+b+y); //10HelloBye20
    System.out.println(x+y+a+b); //30Hellobye
    System.out.println(a+b+x+y); //HelloBye1020
    System.out.println(a+b+x+y); //HelloBye1020
    System.out.println(a+b+(x+y)); //HelloBye30



    


    		
    
	 
}

}
