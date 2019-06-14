package lab8.day1.problem2;

public class Product {

	
	String title;
	double price;
	int model;
	
	public String getTitle() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	public int getModel() {
		return this.model;
	}
	
	public Product(String title, double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
}
