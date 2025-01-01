package func.programming.optional;

import java.util.Optional;

import func.programming.Product;
import func.programming.Products;

public class OptionalExercise1 {

	public static void main(String[] args) {
		Optional<Product> productOptional = getProduct("iPhone 145");
		System.out.println(getProductPrice(productOptional));

	}

	public static Optional<Product> getProduct(String name) {
		return Products.getProducts().stream().filter(d -> d.getProductName().equals(name)).findFirst();
	}

	public static Double getProductPrice(Optional<Product> product) {
		return product.map(Product::getPrice).orElse(-1.0);
	}

}
