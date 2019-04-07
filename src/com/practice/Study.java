package com.practice;

public class Study {

	public static void main(String[] args) {
	String str = "Douglas is studying";
	   
	
	char [] d = str.toCharArray();
	
		int count = 0;
	 for(char m : d) {
		if(m=='s') {
			count++;
		}
	 }
		System.out.println(count);


}

}