package hasNext;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//hasNext();
		checkHasNext();
	}
	
	public static void hasNext() {
		String myName = "";
		Scanner nicky = new Scanner(myName);
		boolean stmt;
		stmt = nicky.hasNext();
		System.out.println(stmt);//returns true or false
		nicky.close();
	}
	
	public static void checkHasNext() {
		String bestLanguage = "My Best Language is JAVA!..";
		bestLanguage = bestLanguage.toLowerCase();
		Scanner nicky = new Scanner(bestLanguage);
		System.out.println("Result: " + nicky.hasNext());
		System.out.println(nicky.nextLine());
	}
	

}
