package func.programming;

import java.util.Arrays;
import java.util.List;

public class Products {

	private static List<Product> productList = Arrays.asList(new Product(1, "iPhone 16", 12.0),
			new Product(1, "iPhone 15", 12.0), new Product(1, "iPhone 14", 12.0), new Product(1, "iPhone 145", null));

	public static List<Product> getProducts() {
		return productList;
	}

}
