package abstraction;

public class Main {

	public static void main(String[] args) {
		Employee e = new Salary("Nick", "nick@gmail.com", 4,  500000);
		Salary s = new Salary("Bryan", "kobe@gmail.com", 3, 450000);
		
		System.out.println("Calling mailcheck using Employee Reference... ");
		e.mailCheck();
		System.out.println("\nCalling mailCheck using Salary reference...");
		s.mailCheck();
		
	}

}
/*
 * PROPERTIES OF ABSTRACT CLASSES 
 * 1. You cannot instantiate an abstract class.(create an instance of an object of that abstract class)
 * 2. When you declare a method inside a class abstract, then the whole class must be declared abstract
 * 3. You Must override all abstract methods when you inherit it in a different class
 * ********************
 * NOTE
 * It is possible to declare a class where the main method is to be abstract because, 
 * the main method is static and is associated to classes while abstract is associated to objects 
 * therefore you can still make a class where the main method is to be abstract and you can still 
 * implement your methods there within but now after you declare it you cannot instantiate that abstract class*/
 