package func.programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CartItem {

	private String name;
	private Optional<Double> price;

	public CartItem(String name, Optional<Double> price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Double> getPrice() {
		return price;
	}

	public void setPrice(Optional<Double> price) {
		this.price = price;
	}

	public static List<CartItem> getList() {
		return Arrays.asList(new CartItem("Smartphone", Optional.of(799.99)),
				new CartItem("Laptop", Optional.of(1299.99)), new CartItem("Headphones", Optional.of(199.99)),
				new CartItem("Smartwatch", Optional.of(349.50)), new CartItem("Tablet", Optional.of(499.99)),
				new CartItem("Bluetooth Speaker", Optional.empty()), // Missing price
				new CartItem("TV", Optional.of(899.99)), new CartItem("Digital Camera", Optional.empty()),
				new CartItem("Smart webs", Optional.of(1299.99))// Missing
																											// price
		);
	}

}
