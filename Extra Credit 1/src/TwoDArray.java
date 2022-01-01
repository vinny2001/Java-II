// Vincenzo D'Aria
// CS-152-02
// Extra Credit #1


public class TwoDArray {

	public static double[][] printTL(double[][] array) {
		for (int i = 0; i < array[i].length; i++) {
			System.out.println("\t");
			for (int j = 0; j <= array[i].length + 1; j++) {
				System.out.print("\t" + array[j][i]);
			}
		}
		return array;
	}

	public static double[][] printTR(double[][] array) {
		for (int i = 0; i < array[i].length; i++) {
			System.out.println("\t");
			for (int j = array[i].length + 1; j >= 0; j--) {
				System.out.print("\t" + array[j][i]);
			}
		}
		return array;
	}

	public static double[][] printBL(double[][] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("\t");
			for (int j = 0; j <= array[i].length - 1; j++) {
				System.out.print("\t" + array[i][j]);
			}
		}
		return array;
	}

	public static double[][] printBR(double[][] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("\t");
			for (int j = array[i].length - 1; j >= 0; j--) {
				System.out.print("\t" + array[i][j]);
			}
		}
		return array;
	}

	public static void main(String[] args) {

		//Create new 2D Array of double values

		//@formatter:off
		final double[][] array ={{1.0, 2.0, 3.0}, {1.1, 2.1, 3.1}, {1.2, 2.2, 3.2}, {1.3, 2.3, 3.3}, {1.4, 2.4, 3.4}};
		//@formatter:on

		System.out.println("Array[col][row] with [0][0] oriented Top-left" + "\n");
		TwoDArray.printTL(array);
		System.out.println("\n" + "Array[col][row] with [0][0] oriented Top-right" + "\n");
		TwoDArray.printTR(array);
		System.out.println("\n" + "Array[row][col] with [0][0] oriented Bottom-left" + "\n");
		TwoDArray.printBL(array);
		System.out.println("\n" + "Array[row][col] with [0][0] oriented Bottom-right" + "\n");
		TwoDArray.printBR(array);
	}

}
