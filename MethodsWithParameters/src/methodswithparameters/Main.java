package methodswithparameters;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		MyName nickyObj = new MyName();
		String name;
		System.out.println("What is your Name: ");
		name = nicky.nextLine();
		nickyObj.setName(name);
	}

}
