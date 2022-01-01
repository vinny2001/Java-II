
public class Food {
	private String food;
	private double price;

	public Food(String food, double price) {
		this.food = food;
		this.price = price;
	}

	public String getFood() {
		return food;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		String result = food + " ............. " + price;
		return result;
	}

}
