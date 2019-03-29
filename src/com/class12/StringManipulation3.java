package com.class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		
		String str = "Students";
		char character = str.charAt(7);
		System.out.println(character);
		
		for (int i = 0; i <str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
	//---------------------------------------------------------------	
		
       String str1 = "Sunday";
       int index = str1.indexOf("d");
       System.out.println(index);
       
       String str2 = "Syntax Technologies";
       
       System.out.println(str2.indexOf("Syntax")); //0
       System.out.println(str.indexOf("echologies")); //7
      
       System.out.println(str.indexOf(""));  //6
       
      System.out.println("----when character does not exist always: -1"); 
       System.out.println(str.indexOf("w")); // -1
       
    //-------------------------------------------------------------------------
       System.out.println("-------------substring-----------------");
       String str3 = "Today is Sunday Java Class";
       String newString = str3.substring(5);
       System.out.println(newString);
       
       System.out.println(str3.substring(0, 5)); // Today
       System.out.println(str3.substring(9, 20)); // Sunday Java
       System.out.println(str3.substring(16, 20)); // Java
       
       System.out.println(str3.substring(21)); // class
       
	}

}
