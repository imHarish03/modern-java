package func.programming.optional;

import java.util.List;

import func.programming.CartItem;

public class OptionalExercise51 {
	public static void main(String[] args) {
		List<CartItem> cartItems = CartItem.getList();
		System.out.println(calculateTotalPrice(cartItems));
	}

	private static double calculateTotalPrice(List<CartItem> cartItems) {
		return cartItems.stream().filter(item -> item.getPrice().isPresent()).map(item -> item.getPrice().get())
				.reduce(Double::sum).orElse(0.0);
	}
}
