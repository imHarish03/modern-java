package func.programming.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Integer[] numbersIntegers = new Integer[5];
//		int num = numbersIntegers[1].intValue();

		Optional<Integer> num = Optional.ofNullable(numbersIntegers[1]);
		int daat = num.orElse(1);

		int daat2 = num.orElseGet(() -> 1);

	}
}
