package arraysPassing;

import java.util.Scanner;

public class PassingArraysToMethods {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int rikki[] = new int[5];
		for(int i=0; i<1; i++) {//this loop will execute once 
			System.out.println("Enter First Number: ");
			rikki[0] = nicky.nextInt();
			System.out.println("Enter Second Number: ");
			rikki[1] = nicky.nextInt();
			System.out.println("Enter Third Number: ");
			rikki[2] = nicky.nextInt();
			System.out.println("Enter Fourth Number: ");
			rikki[3] = nicky.nextInt();
			System.out.println("Enter Fifth Number: ");
			rikki[4] = nicky.nextInt();
		}
		
		change(rikki);
		for(int n: rikki) {
			System.out.println(n);
		}
		
	}
	
		public static void change(int x[]) {//passing an array into a method
			for(int z=0; z<x.length; z++)
				x[z]+=1;
		}
	
}