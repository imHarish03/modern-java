package func.programming.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {

		Consumer<String> stringLengthConsumer = System.out::println;
		stringLengthConsumer.accept("Hariharan");
	}

}
