package func.programming.consumer;

import java.util.function.BiConsumer;

public class BiconsumerExample {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biconsumer = (a, b) -> System.out.println(a + b);
		biconsumer.accept(1, 2);
	}
}
