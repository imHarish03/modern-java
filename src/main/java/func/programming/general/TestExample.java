package func.programming.general;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import func.programming.Instructor;
import func.programming.Instructors;

public class TestExample {

	public static void main(String[] args) {

		List<Instructor> instructors = Instructors.getAllInstructors();
		List<Instructor> filteredData = instructors.stream().map(data -> data.getCourses().size()).distinct()
				.peek(size -> System.out.println("Data Filetered:" + size)).sorted(Comparator.reverseOrder()).skip(1)
				.limit(1).peek(dt -> System.out.println("After Filter: " + dt)).flatMap(thirdExperience -> instructors
						.stream().filter(infoExp -> infoExp.getExpreience() == thirdExperience))
				.collect(Collectors.toList());

		filteredData.forEach(userInfo -> {
			System.out.println("*****" + userInfo.getName());
		});

		System.out.println(Stream.of(1, 2, 3).collect(Collectors.counting()));

		List<String> userNameStrings = Instructors.getAllInstructors().stream()
				.sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.mapping(Instructor::getName, Collectors.toList()));

		userNameStrings.forEach(System.out::println);

		Map<Integer, List<String>> instruMap = Instructors.getAllInstructors().stream().collect(Collectors
				.groupingBy(Instructor::getExpreience, Collectors.mapping(Instructor::getName, Collectors.toList())));

		instruMap.forEach((k, v) -> {
			System.out.println("Experien: " + k + ", Value: " + v);
		});

	}
}
