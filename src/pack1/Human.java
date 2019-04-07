package pack1;

public class Human {
      String eyeColor = "Brown";  // instance variables
      int height = 6; 
      int weight = 180;  // initialized variables
      String gender = "F";
      String programmingLanguage = "java"; //instance variable
      
      void speak() {
    	  String language = "English";  // local variable
    	  System.out.println("Humans can speak "+language);
    	 
      }
      void coding() {
    	  System.out.println("Syntax students can code");
      }
     void print() {
    	 System.out.println(eyeColor);
     }
}


