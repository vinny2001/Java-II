// Vincenzo D'Aria
// CS-152-02
// Homework 3 - Reverse Selection Sorter

// Main Class
public class ReverseSelectionSorter {
	//Method that uses the reverse selection sort algorithm with the comparable interface for type Integer
	public static void reverseSelectionSortInteger(Comparable<Integer>[] list) {
		//Moves boundary of unsorted array by 1
		for (int i = 0; i < list.length - 1; i++) {
			//Find minimum element in the array
			int minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[minIndex].compareTo((Integer) list[j]) == 1) {
					minIndex = j;
				}
			}
			//Swap minimum element with first element
			Comparable<Integer> temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}

	}//Close reverseSelectionSortInteger

	//Method that uses the reverse selection sort algorithm with the comparable interface for type Book
	public static void reverseSelectionSortBook(Comparable<Book>[] list) {
		//Moves boundary of unsorted array by 1
		for (int i = 0; i < list.length - 1; i++) {
			//Find minimum element in the array
			int minIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[minIndex].compareTo((Book) list[j]) == 1) {
					minIndex = j;
				}
			}
			//Swap minimum element with first element
			Comparable<Book> temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}

	}//Close reverseSelectionSortBook

}//Close main class
