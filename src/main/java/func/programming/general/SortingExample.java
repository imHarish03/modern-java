package func.programming.general;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import func.programming.Instructor;
import func.programming.Instructors;

public class SortingExample {
	public static void main(String[] args) {
		List<Instructor> instructorList = Instructors.getAllInstructors();

		System.out.println("=====");
		instructorList = instructorList.stream().sorted(Comparator.comparing(Instructor::getName).reversed())
				.collect(Collectors.toList());
		// instructorList.forEach(info -> System.out.println(info.getName()));

		/// Find 3rd highest experience
		System.out.println("=====================================");
		List<Instructor> outData = Instructors.getAllInstructors().
				stream().map(Instructor::getExpreience)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.limit(1)
				.peek(System.out::println)
				.flatMap(thirdExperience -> Instructors.getAllInstructors().stream()
						.filter(infoExperience -> infoExperience.getExpreience() == thirdExperience))
				.collect(Collectors.toList());

		System.out.println("outData: " + outData.size());
		outData.forEach(info1 -> System.out.println(info1.getName()));

	}

}
