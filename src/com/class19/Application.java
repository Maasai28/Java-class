package com.class19;

public class Application {      // can only be public or default

	public static void main(String[] args) {
		
		 Animal Dog = new  Animal();
		 System.out.println("----------Dog-------------");
		 System.out.println(Dog.age);
		 System.out.println(Dog.weight);
		 System.out.println(Dog.breed);
		 System.out.println(Dog.name);
		 
		 System.out.println(Dog.canBark());
		  System.out.println(Animal.isWild());  // belongs to class Animals. I don't have to create an object i.e. Dog
		 
		 Dog.name = "Fox";
		 Dog.age = 9;
		 System.out.println(Dog.age);
		 
		 
		 Animal Dog2 = new Animal();
		 System.out.println("-------------Dog2-----------");
		 System.out.println(Dog2.age);
		 System.out.println(Dog2.weight);
		 System.out.println(Dog2.breed);
		 System.out.println(Dog2.name);
		 
		 Dog2.canBark();
		 Animal.isWild(); // create an instance no need to create an objectkj
		 
		 Animal Dog3 = new Animal();
		 System.out.println("---------------Dog3----------");
		 System.out.println(Dog3.age);
		 System.out.println(Dog3.weight);
		 System.out.println(Dog3.breed);
		 System.out.println(Dog3.name);
		 
		 Dog3.canBark();
		 Animal.isWild();
		 
		// Minimum array = new Minimum();
		 int my_array[] = { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		 System.out.println("------------printing my minimum------------");
		 
		  System.out.println( Minimum.minOfValues(my_array));
		  
		  int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		 System.out.println("-----------printing my max-------------");
		 
		 System.out.println(Minimum.maxOfValues(array));
		 
		 
		 

	}
}
