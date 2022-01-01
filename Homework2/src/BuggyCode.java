// Vincenzo D'Aria
// CS-152-02
// Homework 2 Problem 1 - BuggyCode


import java.util.Scanner;

/**
 * Some buggy code to practice methodical debugging and creating a test harness.
 * 
 * This code has a few bugs
 * 
 * @author Chad Williams
 *
 */
public class BuggyCode {
	/** Holds the cumulative sum of calls to the add methods */
	private int value = 0;

	/**
	 * Creates an instance of the class for collecting the cumulative sum
	 */
	public BuggyCode() {

	}

	/**
	 * Returns the sum of all numbers that have been added so far
	 * 
	 * @return Cumulative value
	 */
	public int getCumulativeValue() {
		return this.value; //PROBLEM AREA: Changed to 'this.value' instead of '.value'
	}

	/**
	 * Adds the passed value to the sum
	 * 
	 * @param value New value to be added
	 */
	public void add(int value) {
		this.value += value; //Added .this method
		System.out.println("this.value is:" + this.value); //Used for debugging purposes
	}

	/**
	 * Adds each int in the array to the cumulative sum
	 * 
	 * @param values New values to be added
	 */

	//BUG FIXED: int i was changed to 0 instead of 1 to account for all values in the array.
	public void addArray(int[] values) {
		for (int i = 0; i < values.length; i++) {
			add(values[i]);
			System.out.println("values[i] is: " + values[i]); //Used for debugging purposes
		}
	}

	/**
	 * Method takes a string with integers separated by spaces and returns an int array Ex. "1 2 3"
	 * would return [1,2,3]
	 * 
	 * @param intArrayString Integers separated by spaces
	 * @return int array of passed values
	 */


	public static int[] getIntArrayFromString(String intArrayString) {
		String[] intParts = intArrayString.split(" ");
		int[] returnArray = new int[intParts.length];
		int index = 0;
		while (index < intParts.length) {
			returnArray[index] = Integer.parseInt(intParts[index]);
			index++;
		}
		return returnArray;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner scan = new Scanner(System.in);
		String inputString = "";

		// Create instance and add numbers entered by user
		BuggyCode code = new BuggyCode(); //Possible problem area

		System.out.println("Enter first number to add: ");
		int numberEntered = Integer.parseInt(scan.nextLine());
		code.add(numberEntered);
		System.out.println("Enter second number to add: ");
		numberEntered = Integer.parseInt(scan.nextLine());
		code.add(numberEntered);
		System.out.print("Enter a set of numbers each separated by a space: ");
		inputString = scan.nextLine();
		int[] intArray = getIntArrayFromString(inputString); //Possible Problem Area, not adding these to the rest correctly (see comment above)
		code.addArray(intArray);


		System.out.println("The total of the values entered is: " + code.getCumulativeValue());
		scan.close(); // Scanner closed to prevent security vulnerabilities
	}

}
