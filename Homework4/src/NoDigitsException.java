// Vincenzo D'Aria
// CS-152-02
// Homework 4 - No digits exception


@SuppressWarnings("serial")

//Exception class that extends the RuntimeException hierarchy
public class NoDigitsException extends RuntimeException {
	//Method called NoDigitsException()
	public NoDigitsException() {
		//Statement that is printed when the method is thrown
		System.out.println("No digits found");
	}

}
