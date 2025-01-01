package func.programming.analyze;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.event.ListSelectionEvent;

public class TestExample1 {
	public static void main(String[] args) {

		List<Integer> numberInfoIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 78, 9, 0);
		numberInfoIntegers = numberInfoIntegers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		numberInfoIntegers.forEach(System.out::println);

		/// Sqaure Nu,bers
		numberInfoIntegers = numberInfoIntegers.stream().map(n -> n * n).collect(Collectors.toList());
		numberInfoIntegers.forEach(System.out::println);

		///
		List<String> dataList = Arrays.asList("Hari", "Senythiol", "demo", "test", "Senythilo", "Hari", "Senythiol");
		String finaString = dataList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println(finaString);

		///////////////////////////////////////
		Map<Integer, List<String>> infoMap = dataList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(infoMap);

		Optional<String> longeString = dataList.stream().sorted((e1, e2) -> e1.length() > e2.length() ? 1 : -1)
				.findFirst();

		System.out.println(longeString);

		////
		Map<String, Long> wordCountInfo = dataList.stream()
				.collect(Collectors.groupingBy(data -> data, Collectors.counting()));
		System.out.println(wordCountInfo);

		////
		List<List<Integer>> integernestList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
		List<Integer> combinedDataIntegers = integernestList.stream().flatMap(data -> data.stream())
				.collect(Collectors.toList());

		System.out.println(combinedDataIntegers);

		Map<String, List<Integer>> dataInfo = numberInfoIntegers.stream()
				.collect(Collectors.groupingBy(data -> data % 2 == 0 ? "EVEN" : "ODD", Collectors.toList()));
		System.out.println(dataInfo);

		numberInfoIntegers = numberInfoIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println(numberInfoIntegers);

		List<Integer> inDataIntegers = Arrays.asList(5, 3, 8, 2, 8, 1, 5, 9, 2, 7, 3);
		List<Integer> uniqueDataIntegers = inDataIntegers.stream().distinct().sorted().collect(Collectors.toList());

		System.out.println(inDataIntegers.stream().reduce(0, (a, b) -> a + b));

		int i = 7687;
		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::valueOf).reduce(0,
				(a, b) -> a + b); // .collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sumOfDigits);

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);


		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		listOfIntegers = listOfIntegers.stream().distinct().collect(Collectors.toList());

		System.out.println(listOfIntegers);

	}

}
