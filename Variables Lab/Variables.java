//Variables.java
// Author: Mary Carrigan
// Class: CS 164
// Date: Jan 3, 2020

public class Variables {
	public static void main (String args[]) {
		//EXAMPLES USING MATH, INTS AND DOUBLES
		int i = Math.abs(-7);
		System.out.println("Absolute value of -7 is: " + i);
		
		// some math methods have a return type of double, so it must be cast if assigned to an int
		double j = Math.sqrt(25);
		int jInt = (int)Math.sqrt(25);
		System.out.println("Square root of 25 is: " + j + " or " + jInt);
		
		double k = Math.pow(7, 2);
		System.out.println("Seven squared is: " + k);
		
		System.out.println();
		//EXAMPLES USING STRING METHODS
		String s = "What's crackalackin";
		String sUpper = s.toUpperCase();
		System.out.println(s);
		System.out.println(sUpper);
		
		// concatenating a ? to my greeting
		s += "?";
		
		String firstFive = s.substring(0,4);
		System.out.println("First five characters are: " + firstFive);
		
		System.out.println("Length of my greeting is: " + s.length());
		
		System.out.println("First character of my greeting is: " + s.charAt(0));
		
		
	}
}
