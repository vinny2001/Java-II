// Vincenzo D'Aria
// CS-152-02
// Homework 3 - Novel Class

// Child class of Book
public class Dictionary extends Book {
	private int numWords;

	//Constructor
	public Dictionary(String title, int year, int numWords) {
		//Super method: invokes title and year from parent class
		super(title, year);
		this.numWords = numWords;
	}

	//Getter for the instance of numWords
	public int getNumWords() {
		return numWords;
	}

	//toString method that returns the title and word count in the "dictionary" format
	public String toString() {
		return super.toString() + " definitions of " + numWords + " words";
	}//End of toString()

}//End of class

