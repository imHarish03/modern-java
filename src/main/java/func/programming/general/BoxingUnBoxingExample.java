package func.programming.general;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		IntStream numbers = IntStream.range(1, 20);
		List<Integer> data = numbers.boxed().collect(Collectors.toList());

		int sum = data.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		Optional<Integer> sumByReduce = IntStream.rangeClosed(1, 5).boxed().reduce((a, b) -> a + b);
		System.out.println(sumByReduce.get());
	}
}
