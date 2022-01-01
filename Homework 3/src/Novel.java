// Vincenzo D'Aria
// CS-152-02
// Homework 3 - Novel Class

// Child class of Book
public class Novel extends Book {
	private String author;

	//Constructor
	public Novel(String title, int year, String author) {
		//Super method: invokes title and year from parent class
		super(title, year);
		this.author = author;
	}

	//Getter for the instance of author
	public String getAuthor() {
		return author;
	}

	//toString method that returns the title and author in the "novel" format
	public String toString() {
		return super.toString() + " by " + author;

	}// End of toString()

}// End of class
