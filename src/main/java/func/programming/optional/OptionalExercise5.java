package func.programming.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import func.programming.CartItem;

public class OptionalExercise5 {

	public static void main(String[] args) {

		List<CartItem> cartItemList = CartItem.getList();

		double total = calculateTotalPrice(cartItemList);
		System.out.println("Double Price: " + total);
		// System.out.println(getMaxPricedItem(cartItemList));
		System.out.println(getMaxPricedItem(cartItemList).get().getName());

	}

	private static double calculateTotalPrice(List<CartItem> cartItemList) {
		return cartItemList.stream().map(CartItem::getPrice) // Get the Optional<Double> for each item
				.flatMap(Optional::stream) // Convert Optional to stream, will be empty if no value
				.reduce(0.0, Double::sum); // Sum all prices, default to 0.0
	}

	/*
	 * private static String getMaxPricedItem(List<CartItem> cartItems) { return
	 * cartItems.stream().filter(item -> item.getPrice().isPresent()) .sorted((obj1,
	 * obj2) -> obj1.getPrice().get() < obj2.getPrice().get() ? 1 : -1).findFirst()
	 * .map(CartItem::getName).stream().findFirst().get();
	 * 
	 * }
	 */

	private static Optional<CartItem> getMaxPricedItem(List<CartItem> cartItems) {
		return cartItems.stream().filter(item -> item.getPrice().isPresent()) // Filter items with a price present
				.sorted((item1, item2) -> Double.compare(item2.getPrice().get(), item1.getPrice().get())) // Sort by
				.findFirst();
	}
	
	public static Optional<String> getMaxPricedItems(List<CartItem> cartItems) {
	    return cartItems.stream()
	                    .filter(item -> item.getPrice().isPresent()) // Only consider items with a price
	                    .max(Comparator.comparingDouble(item -> item.getPrice().get()))
	                    .map(CartItem::getName); // Return the name of the item with the highest price
	}
}
