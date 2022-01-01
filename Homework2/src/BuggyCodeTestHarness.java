
public class BuggyCodeTestHarness {

	/*
	 * Creates a BuggyCode object and calls various methods to test
	 */
	public static void main(String[] args) {

		// create new BuggyCode object
		BuggyCode code = new BuggyCode();

		// test numbers
		int smallDouble = 2;
		double bigDouble = 999999;
		String spacedDouble = "1 2 3 4";

		code.add(smallDouble);

		// test the add(int value) method with a small int
		// expected behavior: parameter value is added to code.value
		int valueBeforeTest = code.getCumulativeValue();
		System.out.println("Testing method: add(int value)   ");
		System.out.println("Expected result: " + (valueBeforeTest + smallDouble));
		System.out.println("Actual result: " + code.getCumulativeValue() + smallDouble);
		if ((valueBeforeTest + smallDouble) == code.getCumulativeValue() + smallDouble) {
			System.out.println("TEST PASSED");
		} else {
			System.out.println("*** TEST FAILED ***");
		}


		// test the add(int value) method with a big int
		valueBeforeTest = code.getCumulativeValue();
		System.out.println("Testing method: add(int value)   ");
		System.out.println("Expected result: " + (valueBeforeTest + bigDouble));
		System.out.println("Actual result: " + code.getCumulativeValue() + bigDouble);
		if ((valueBeforeTest + bigDouble) == code.getCumulativeValue() + bigDouble) {
			System.out.println("TEST PASSED");
		} else {
			System.out.println("*** TEST FAILED ***");
		}

		//test the addArray(intArray) method with spaced values
		valueBeforeTest = code.getCumulativeValue();
		System.out.println("Testing method: addArray(intArray)   ");
		System.out.println("Expected result: " + (valueBeforeTest + spacedDouble));
		System.out.println("Actual result: " + code.getCumulativeValue() + spacedDouble);
		if ((valueBeforeTest + spacedDouble) == code.getCumulativeValue() + spacedDouble) {
			System.out.println("TEST PASSED");
		} else {
			System.out.println("*** TEST FAILED ***");
		}

	}

}
