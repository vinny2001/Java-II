import java.util.Arrays;

public class BookTester {
	public static void main(String[] args) {
		System.out.println("\nInteger array before the Selection Sort Method:");
		Integer[] numbers = {4, 2, 9, 1, 8};
		System.out.println(Arrays.toString(numbers));
		ReverseSelectionSorter.reverseSelectionSortInteger(numbers);
		System.out.println("\nInteger array after the Selection Sort Method:");
		System.out.println(Arrays.toString(numbers));

		System.out.println("\nTitles: \n");
		Book book = new Book("Zanny Java Programming", 2017);
		Novel novel1 = new Novel("Joyland", 2005, "Emily Schultz");
		Novel novel2 = new Novel("Joyland", 2013, "Stephen King");
		Dictionary dict = new Dictionary("Webster's Dictionary", 2021, 470000);
		System.out.println(book);
		System.out.println(novel1);
		System.out.println(novel2);
		System.out.println(dict + "\n");

		Book[] books = {book, novel1, novel2, dict};
		System.out.println("\nBook object array before the Selection Sort Method:");
		System.out.println(Arrays.toString(books));
		ReverseSelectionSorter.reverseSelectionSortBook(books);
		System.out.println("\nBook object array after the Selection Sort Method:");
		System.out.println(Arrays.toString(books));
	}
}
