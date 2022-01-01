public class NoDigitsTester {

	public static void main(String[] args) throws NoDigitsException {
		//new object of the Keyboard class created
		Keyboard input = new Keyboard();

		//Variables that increment for both of the while-loops
		int count = 0;
		int count2 = 0;

		//Runs while count < 1
		while (count < 1) {
			try {
				//Runs the getDouble() method until exception occurs
				input.getDouble();
			} catch (NoDigitsException noDigits) {
				//Increments count after exception
				count++;
			}
		}
		while (count2 < 1) {
			try {
				//Runs the getInt() method until exception occurs
				input.getInt();
			} catch (NoDigitsException noDigits) {
				//Increments count2 after exception
				count2++;
			}
		}

		//Runs when the getDouble() and getInt() methods have each thrown an exception, meaning two exceptions have now been thrown
		if (count == 1 && count2 == 1) {
			//Prints after two exceptions have occurred
			System.out.println("\nTwo exceptions occurred, program exiting...");
			//Quits program
			System.exit(0);
		}
	}//End main method

}// End class
