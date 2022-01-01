
public class NoDigitsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDigitsException(String message) {
		try {
			System.out.print("");
		}catch(Exception.NumericFormatException noDigit){
			
		}
	}

}
