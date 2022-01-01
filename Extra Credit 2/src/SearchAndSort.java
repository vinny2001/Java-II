// Vincenzo D'Aria
// CS-152-02
// Search and Sort Methods for extra credit #2


public class SearchAndSort {

	//Binary Search Method
	long binarySearch(long array[], long left, long right, long target) {

		if (right >= 1) {
			long mid = (right + left) / 2;

			//If the element selected is already at the middle
			if (array[(int) mid] == target) {
				return mid;
			}
			//if element is smaller than mid, then go to left sub array
			if (array[(int) mid] > target) {
				return binarySearch(array, 1, mid - 1, target);
			} else {
				//Else go to the right sub array
				return binarySearch(array, mid + 1, right, target);
			}

		}
		//return -1 if element isn't reachable in array
		return -1;
	}//End binarySearch

	//-------------------------------------------------------------------------------------------------------

	//Bubble Sort Method
	void bubbleSort(long array[]) {
		long length = array.length;
		//iterating through the data
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < (length - i) - 1; j++) {
				if (array[j] > array[j + 1]) {

					//swapping arr[j+1] and arr[j]
					long temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				} //End if-statement for swap
			} //End inner for-loop
		} //End outer for-loop
	}//End bubbleSort

	//--------------------------------------------------------------------------------------------------------

	//Linear Search Method
	double linearSearch(long arr[], long target) {
		long length = arr.length;
		//Iterating through data
		for (int i = 0; i < length; i++) {
			//If target is found, return the value of the element in which it was found
			if (arr[i] == target) {
				return i;
			}
		}
		//if target isn't found, return -1
		return -1;
	}//End linear search

}//End Main Class
