import java.util.Scanner;

//Scanners.java
// Author: Mary Carrigan
// Class: CS 164
// Date: Jan 2, 2020

public class Scanners {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = scnr.next();
		
		System.out.print("Enter your last name: ");
		String lastName = scnr.next();
		scnr.nextLine();
		
		System.out.print("Enter your hometown: ");
		String hometown = scnr.nextLine();
		
		
		System.out.println("Enter your age: ");
		int age = scnr.nextInt();
		
		System.out.printf("Hello! My name is %s %s and I am from %s. I am %d years old.", firstName, lastName, hometown, age);
		
		scnr.close();
		
	}
}
