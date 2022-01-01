// Vincenzo D'Aria
// CS-152-02
// Homework 3 - Book Class

// Parent class that implements the comparable interface for the Book object
public class Book implements Comparable<Book> {

	//Instance variables
	private String title;
	private int year;

	//Constructor 
	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	//Returns string instance of title
	public String getTitle() {
		return title;
	}

	//Returns string instance of year
	public int getYear() {
		return year;
	}

	//Returns a nicely formatted result for the title
	public String toString() {
		String result = "Title: " + title;
		return result;
	}

	//compareTo method for the object Book based on the order of an instance of a title or year
	public int compareTo(Book that) {
		if (this.getTitle().compareTo(that.getTitle()) < 0) {
			return -1; //Title gets returned before the title being compared to
		} else if (this.getTitle().compareTo(that.getTitle()) > 0) {
			return 1; //Title gets returned after the title being compared to
		} else { //Runs if titles are equal, now ordering must go off of years
			if (this.getYear() < that.getYear()) {
				return -1; //Year gets returned before the year being compared to
			} else if (this.getYear() > that.getYear()) {
				return 1; //Year gets returned after the year being compared to
			} else {
				return 0; //Everything equal!
			}
		}

	}//End of compareTo() method

}//End parent class
