package func.programming.stream;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		UnaryOperator<Integer> increment = a -> a + 2;
		Stream<Integer> steam = Stream.iterate(0, increment).limit(5);

		steam.forEach(System.out::println);
	}
}
