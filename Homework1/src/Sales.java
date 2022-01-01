// Vincenzo D'Aria
// CS-151-02
// Homework 1

// Importing scanner and file management system from appropriate libraries
import java.io.File;
import java.util.Scanner;

// Main class
public class Sales {
	//Main method
	public static void main(String args[]) throws java.io.FileNotFoundException, java.io.IOException {
		double[][] sales = new double[4][6];
		//@formatter:off
		
		Scanner scanner = new Scanner(new File("C:\\Users\\Vinny\\eclipse-workspace\\Homework1\\src\\salesSlips.txt")); 
		String line = scanner.nextLine();
		//@formatter:on

		//Variables representing the total values on the table
		double rowTotal = 0;
		double totalSales = 0;
		double colTotal = 0;

		//@formatter:off
		System.out.print("\n\t" + "     " + "Person1" + "   " + "Person2\t" + " "+ "Person3" + "   " + "Person4" + "  " + "Total" + "\n");
		//@formatter:on

		//While-loop containing code to parse array into double format
		while (scanner.hasNext()) {

			line = scanner.nextLine();
			String lineArray[] = line.split(","); //Splits array into individual parts based on comma delimiter

			String person = lineArray[0];
			int personInt = Integer.parseInt(person);

			String product = lineArray[1];
			int productInt = Integer.parseInt(product);

			double amountDouble = Double.parseDouble(lineArray[2]);
			sales[personInt - 1][productInt - 1] += amountDouble;
		}

		//Loops for printing out the parsed data in a tabular format

		for (int j = 0; j < 6; j++) {
			System.out.print("Product " + (j + 1));
			rowTotal = 0.0;
			for (int i = 0; i < 4; i++) {
				rowTotal += sales[i][j];
				System.out.printf("%10.2f", sales[i][j]);
			}
			System.out.printf("%10.2f\n", rowTotal);
		}
		System.out.print("TotalSales");

	//@formatter:off
		
		for (int i = 0; i < 4; i++) {
			colTotal = 0.0;
			for (int j = 0; j < 6; j++)
				colTotal += sales[i][j];
				System.out.printf("%10.2f", colTotal);
				totalSales += colTotal;
		}
		System.out.printf("%10.2f", totalSales);
		
		//scanner closed to prevent vulnerabilities
		scanner.close();
	//End Main Method
	}
//End Main Class
}