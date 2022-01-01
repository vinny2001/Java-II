// Vincenzo D'Aria
// CS-152-02
// Homework 2 Problem 2

import java.util.Scanner;

public class IntegralCalculator {

	//instance variables for quadratic equation created and initialized
	private static double aValue = 0.0;
	private static double bValue = 0.0;
	private static double cValue = 0.0;


	//Integral Calculator object created
	public IntegralCalculator() {

	}

	//Method that collects vals for a, b, c, and x; returns values as a quadratic function f(x)
	public double quadratic(double aValue, double bValue, double cValue, double xValue) {
		double functionValue = ((aValue * (xValue * xValue)) + (bValue * xValue) + (cValue));
		return functionValue;
	}

	//Variables for left tolerance, right tolerance,number of bins, and bin width
	private static double leftValue = 0.0;
	private static double rightValue = 0.0;
	private static double xValue = 0.0;
	private static int numberOfBins = 1;
	// @formatter:off
	
	// Left Riemann Sum Method
	public double leftRiemannSum(double aValue, double bValue, double cValue, double rightValue, double leftValue, double numberOfBins) {
		//double value representing the left riemann sum
		double leftSum = 0.0;
		do {
			//F(x) * binWidth
			leftValue = xValue;
			double binWidth = ((rightValue - leftValue) / (numberOfBins));
			leftSum = (((aValue * (xValue * xValue)) + (bValue * xValue) + (cValue))* (binWidth));
			//Increment xValue by binWidth
			xValue += binWidth;
		} while (xValue < rightValue);
		return leftSum;
	}
	//@formatter:on


	//Main method
	public static void main(String[] args) {

		//Scanner invoked to collect values for instance variables
		Scanner scan = new Scanner(System.in);

		//Instance variables collected
		System.out.println("Enter a value for 'a': ");
		aValue = scan.nextDouble();
		System.out.println("\nThe value of 'a' is:" + aValue);

		System.out.println("Enter a value for 'b': ");
		bValue = scan.nextDouble();
		System.out.println("\nThe value of 'b' is:" + bValue);

		System.out.println("Enter a value for 'c': ");
		cValue = scan.nextDouble();
		System.out.println("\nThe value of 'c' is:" + cValue);

		System.out.println("Enter a value for 'x': ");
		xValue = scan.nextDouble();
		System.out.println("\nThe value of 'x' is:" + xValue);

		//New instance of IntegralCalculator() object
		IntegralCalculator calc = new IntegralCalculator();

		//Print the value of the quadratic function F(x)
		System.out.println("The value of F(x) is: " + calc.quadratic(aValue, bValue, cValue, xValue));
		System.out.println("\n\n");

		//Instance variables for Riemann Sum Equation

		System.out.println("Enter the rightmost x coordinate: ");
		rightValue = scan.nextDouble();
		System.out.println("\nThe value of 'rightValue' is:" + rightValue);
		//@formatter:off
		
		//Variables for tolerance/riemann sum calculation loop
		double tolerance = 0.01;
		double previousArea = 0.0;
		double area = 0.0;
		
		//Loop to calculate riemann sum for an increasing number of bins until tolerance
		do {
			previousArea = calc.leftRiemannSum(aValue, bValue, cValue, rightValue, leftValue, numberOfBins);
			numberOfBins++ ;
			area = calc.leftRiemannSum(aValue, bValue, cValue, rightValue, leftValue, numberOfBins);
		}while (Math.abs(area - previousArea)> tolerance);
		
		System.out.println("Number of Bins: "+ numberOfBins);
		System.out.println("Difference between areas: "+ Math.abs(area - previousArea));
		
		
		//Prints the left-riemann sum closest to tolerance
		System.out.println("The Left-Riemann Sum of F(x) is: "+ area);
		
		//@formatter:on
		scan.close(); //scanner closed for security reasons
	}
}
