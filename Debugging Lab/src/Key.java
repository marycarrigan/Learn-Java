import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Key {
	public static void main(String[] args) {
		
		System.out.println("Average of 8, 7 and 1 is: " + average(8, 1, 7));
		System.out.println();
		
		int [] arr1 = {1, 2, 3, 4, 5};
		System.out.println("Original Array: " + Arrays.toString(arr1));
		doubleArray(arr1);
		System.out.println("Array after doubling contents: " + Arrays.toString(arr1));
		
		System.out.println();
		
		System.out.println("Printing Colorado State University until U");
		printString("Colorado State University", 'U');

		System.out.println();
		System.out.println();
		System.out.println("Incrementing 4 by 2, 3 times");
		System.out.println(increment(4,2,3));

		File file1 = new File("testFile.txt");
		int [][] arr2 = new int[4][4];
		System.out.println(readAndFindMin(arr2, file1));
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(Arrays.toString(arr2[i]));
		}
	}
	
		public static double average(int number1, int number2, int number3) {
			return (number1 + number2 + number3) / 3;
		}
		
		public static void doubleArray(int[] arr) {
			int i = 0;
			for(i = 0; i < arr.length; i++)
				arr[i] *= 2;
		}

		public static void printString(String str, char c) {
			int index = 0;
			while(index != str.length()) {
				if(str.charAt(index) == c)
					break;
				else System.out.print(str.charAt(index));
				index++;
			}
		}
		
		public static int increment(int number, int incrementer, int times) {
			int i = 0;
			do {
				number += incrementer;
			}
			while(++i < times);
			return number;
		}
		
		public static int readAndFindMin(int[][] arr, File file1) {
			int min = Integer.MAX_VALUE;
			try {
				Scanner scnr = new Scanner(file1);
				
				while(scnr.hasNextInt()) {
					for(int i = 0; i < arr.length; i++) {
						for(int j = 0; j < arr[i].length; j++) {
							arr[i][j] = scnr.nextInt();
							if(arr[i][j] < min)
								min = arr[i][j];
						} 
						scnr.nextLine();
					}
				}
				scnr.close();
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return min;
		}
}
