package pack1;

public class Application {

	public static void main(String[] args) {
		
		Human person = new Human(); //created an object from class Human same package
		
		    person.eyeColor = "Pink"; // This change does not affect other copies
		    
		    Human person1 = new Human();   
		    person1.print();
		    person1.eyeColor = "Orange";
		    person1.print();
		    
           System.out.println(person.eyeColor);
           System.out.println(person.height);
           System.out.println(person.weight);
           System.out.println(person.gender);
	}

}
