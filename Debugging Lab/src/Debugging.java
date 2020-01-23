import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
// Debugging.java
// Author: Mary Carrigan
// Class: CS 164
// Date: Jan 2, 2020

public class Debugging {
	
	
	
	/* Method purpose: This method calculates the average (sum of numbers/quantity of numbers)
	 * Parameters: number1, number2, and number 3, the three integer numbers that will be averaged
	 * Return: a double that holds the average of the three parameters
	 * 
	 */
	public static double average(int number1, int number2, int number3) {
		return number1 + number2 + number3 / 3;
	}
	
	/* Method purpose: multiplies each entry in an array by 2, doubling each entry
	 * Parameters: arr - an array of ints
	 * Return: none
	 * 
	 */
	public static void doubleArray(int[] arr) {
		int i = 0;
		for(i = 0; i < arr.length-1; i++);
			arr[i] *= 2;
	}

	/* Method purpose: This method prints out a designated string up until the character specified.
	 * 		For example, if given the string "mozzarella" and the char 'e', the method would print "mozzar"
	 * Parameters: str - the string to be printed
	 * 			   c - the char that determines when to stop printing the string
	 * Return: none
	 * 
	 */
	public static void printString(String str, char c) {
		int index = 0;
		while(index != str.length()) {
			index++;
			if(str.charAt(index) == c)
				break;
			else System.out.print(str.charAt(index));
		}
	}
	
	/* Method purpose: his method increments a number a specified number of times by a certain amount. 
	 * 			For example, if given the number 4, an incrementer of 3, and a number of times of 2, it would return 10.
	 * Parameters: number - the number that will be incremented
	 * 			incrementer - the amount by which number is increased 
	 * 			times - the number of times that number is increased by incrementer
	 * Return: an int that is the result after adding incrementer to number the designated number of times
	 * 
	 */
	public static int increment(int number, int incrementer, int times) {
		int i = 0;
		do {
			number += incrementer;
		}
		while(i++ < times);
		return number;
	}
	
	/* Method purpose: This method reads a file that contains integers organized in a table (an example file is given to you),
	 * 	and inputs the values into a two dimensional array. 
	 * Parameters: arr - the two dimensional array that will contain the integers from the file
	 * 			file1 - the file that contains the data
	 * Return: an int that is the minimum value in the table
	 * 
	 */
	public static int readAndFindMin(int[][] arr, File file1) {
		int min = Integer.MIN_VALUE;
		try {
			Scanner scnr = new Scanner(file1);
			while(scnr.hasNext()) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = i; j < arr[i].length; j++) {
						arr[i][j] = scnr.nextInt();
						if(arr[i][j] < min) {
							arr[i][j] = min;
						}
						scnr.nextLine();
					} 
				}
			}
			scnr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return min;
	}
	
	public static void main (String[] args) {
		// You are not given any test code besides two lines that assist in setting up for testing the last method. 
		// You are expected to write your own code here to test the methods and to help debug the program.
		
		//check that the method readAndFindMin returns the correct integer for min, and correctly modifies the array
		File file1 = new File("testFile.txt");
		int [][] arr2 = new int[4][4];
	
	}
	

}
