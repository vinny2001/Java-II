public class POSTester {

	public static void main(String[] args) {
		//--------------------------------------------------------------------------------------
		//Item Header
		System.out.println("Burgers:\n ");

		//Array Containing the Menu List of burgers
		String[] burgerNames =
				{"Junior Burger", "Classic Burger", "Three-Cheese Burger", "American Burger",
						"Double American Burger", "Bacon Burger", "European Burger", "Deluxe Southern Burger"};
		//Array of burger prices
		double[] burgerPrices = {7.99, 8.50, 9.50, 10.00, 11.00, 11.00, 11.25, 12.50};

		//Iterates through the burgers and prices to generate a list; list is then printed
		for (int i = 0; i < burgerNames.length; i++) {
			Food food = new Food(burgerNames[i], burgerPrices[i]);
			System.out.println(i + 1 + ") " + food);
		}
		//--------------------------------------------------------------------------------------

		//Item Header
		System.out.println("\nDrinks:\n");

		//Array of drinks
		String[] drinkNames = {"Coke", "Sweet Tea", "Orange Soda", "Root Beer", "Birch Beer", "Sprite",
				"Apple Juice", "Chocolate Shake", "Stawberry Shake", "Gatorade"};
		//Array of drink prices
		double[] drinkPrices = {1.25, 1.50, 1.25, 1.25, 1.25, 1.25, 1.75, 3.99, 3.99, 2.00};

		//Iterates through the drinks and prices to generate a list; list is then printed
		for (int i = 0; i < drinkNames.length; i++) {
			Food food = new Food(drinkNames[i], drinkPrices[i]);
			System.out.println(i + 1 + ") " + food);
		}
		//---------------------------------------------------------------------------------------



	}

}
