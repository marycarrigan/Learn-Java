import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Key {

	public static void main(String[] args) {
		try {
			Scanner scnr = new Scanner(new File("ReadFile.txt"));
			PrintWriter pw = new PrintWriter(new File("WriteFile.txt"));
			
			String name1 = scnr.nextLine();
			double grade1 = scnr.nextDouble();
			double grade2 = scnr.nextDouble();
			double grade3 = scnr.nextDouble();
			double grade4 = scnr.nextDouble();
			double average1 = (grade1 + grade2 + grade3 + grade4)/4.0;
			pw.println("Name: " + name1 + " Average Score: " + average1);
			
			scnr.nextLine();
			
			String name2 = scnr.nextLine();
			grade1 = scnr.nextDouble();
			grade2 = scnr.nextDouble();
			grade3 = scnr.nextDouble();
			grade4 = scnr.nextDouble();
			double average2 = (grade1 + grade2 + grade3 + grade4)/4.0;
			pw.println("Name: " + name2 + " Average Score: " + average2);
			
			pw.println("Average Score for Both Students: " + ((average1 + average2)/2.0));
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
