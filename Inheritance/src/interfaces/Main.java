package interfaces;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.barks();
		a.Meow();
		// using anonymous objects in java 
		new Animal().barks();
		new Animal().Meow();
	}

}
