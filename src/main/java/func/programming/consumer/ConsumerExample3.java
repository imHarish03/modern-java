package func.programming.consumer;

import java.util.function.IntConsumer;

public class ConsumerExample3 {
	
	public static void main(String[] args) {
		
		IntConsumer multiplyConsumer=(a) -> System.out.println(a*10);
		multiplyConsumer.accept(10);
	}

}
