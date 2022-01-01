// Vincenzo D'Aria
// CS-152-02
// Search and Sort Method Driver Program for extra credit #2

import java.util.Random;

public class SearchAndSortDriver {

	//Generates an array with a random size of indexes
	public static void arrayGen(int arrLength) {
		long[] array = new long[arrLength];
		//Random class instantiated as object gen
		Random gen = null;
		for (int index = 0; index < array.length - 1; index++) {
			gen = new Random();
			double rand = gen.nextDouble();
			array[index] = (long) rand;
		}

		//target value
		long target = 456;

		//instantiating class SearchAndSort as object searchAndSort
		SearchAndSort searchAndSort = new SearchAndSort();

		//Bubble Sort algorithm from class SearchAndSort ran on array of data
		System.out.println("\nBUBBLE SORT");
		long bubbleTime1 = System.nanoTime();
		searchAndSort.bubbleSort(array);
		long bubbleTime2 = System.nanoTime();
		long endTime1 = (bubbleTime2 - bubbleTime1);
		System.out.println("Elapsed time: " + endTime1);

		//Binary Search algorithm from class SearchAndSort ran on array of data
		System.out.println("\nBINARY SEARCH");
		long binaryTime1 = System.nanoTime();
		searchAndSort.binarySearch(array, array[0], array[array.length - 1], target);
		long binaryTime2 = System.nanoTime();
		long endTime2 = (binaryTime2 - binaryTime1);
		System.out.println("Elapsed time: " + endTime2);

		//Linear Sort algorithm from class SearchAndSort ran on array of data
		System.out.println("\nLINEAR SEARCH");
		long linearTime1 = System.nanoTime();
		searchAndSort.linearSearch(array, target);
		long linearTime2 = System.nanoTime();
		long endTime3 = (linearTime2 - linearTime1);
		System.out.println("Elapsed time: " + endTime3);

	}//End arrayGen method

	//Begin Main Method
	public static void main(String[] args) {

		//arrayGen instantiated for an array of random long values with a given number of indexes as a parameter

		System.out.println("-----------------------Array with 10 indexes----------------------------");
		System.out.println("------------------------------------------------------------------------");
		arrayGen(10);
		System.out.println("-----------------------Array with 30 indexes----------------------------");
		System.out.println("------------------------------------------------------------------------");
		arrayGen(30);
		System.out.println("-----------------------Array with 50 indexes----------------------------");
		System.out.println("------------------------------------------------------------------------");
		arrayGen(50);
		System.out.println("-----------------------Array with 70 indexes----------------------------");
		System.out.println("------------------------------------------------------------------------");
		arrayGen(70);
		System.out.println("-----------------------Array with 85 indexes----------------------------");
		System.out.println("------------------------------------------------------------------------");
		arrayGen(85);
		System.out.println("-----------------------Array with 100 indexes----------------------------");
		System.out.println("-------------------------------------------------------------------------");
		arrayGen(100);

	}// End main method

}//End driver class
