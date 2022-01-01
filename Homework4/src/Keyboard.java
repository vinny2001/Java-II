import java.util.Scanner;

public class Keyboard {

	//private variables that initiate the integer value or double value from keyboard
	private int intVal;
	private double doubVal;

	//Constructor
	public Keyboard() {
		intVal = 0;
		doubVal = 0;
	}

	//getInt() method
	public int getInt() throws NoDigitsException {
		//Invoke scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------getInt() method---------------------------");
		System.out.print("Type input here (**input must be an integer**) then press enter: ");
		//Scan for next line of input
		String input = scan.next();
		//takes the entire string 'input' and extracts any possible integer (digit) input
		String digitsFromInput = input.replaceAll("[^0-9]", "");
		try {
			//parses the digit input into an int
			intVal = Integer.parseInt(digitsFromInput);
			//prints the int as an output
			System.out.println("Digits from input: " + intVal);
		} catch (NumberFormatException noDigits) {
			//Otherwise, throw NoDigitsException
			throw new NoDigitsException();
		}
		//returns intVal as type int
		return intVal;
	}

	//getDouble() method
	public double getDouble() throws NoDigitsException {
		//Invoke scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------getDouble() method---------------------------");
		System.out.print("Type input here (input can be any number) then press enter: ");
		//Scan for next line of input
		String input = scan.next();
		//takes the entire string 'input' and extracts any possible double (digit) input
		String digitsFromInput = input.replaceAll("[^0.0-9.9999999]", "");
		try {
			//parses the digit input into a double
			doubVal = Double.parseDouble(digitsFromInput);
			//Rounds doubVal to one decimal place or puts a '.0' to a number with no decimal places
			doubVal = (double) (Math.round(doubVal * 10.0) / 10.0);
			//prints the double as an output
			System.out.println("Digits from input: " + doubVal);

		} catch (NumberFormatException noDigits) {
			//Otherwise, throw NoDigitsException
			throw new NoDigitsException();
		}
		//returns doubVal as type double
		return doubVal;
	}// End getDouble()

}//End class
