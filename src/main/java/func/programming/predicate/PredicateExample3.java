package func.programming.predicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

public class PredicateExample3 {

	public static void main(String[] args) {

		Predicate<Instructor> checkOnline = data -> data.isOnline();
		Predicate<Instructor> isExperienceGreaterThan5 = data -> data.getExpreience() > 5;

		BiConsumer<String, List<Courses>> printNameConsumer = (name, course) -> System.out
				.println(name + " is offering courses on " + course);

		List<Instructor> instructors = Instructors.getAllInstructors();

		instructors.forEach(

				data -> {
					if (checkOnline.and(isExperienceGreaterThan5).test(data)) {
						printNameConsumer.accept(data.getName(), data.getCourses());
					}
				});

		// Function<Instructor,Integer> updateOnlineOperator=data-> data.getId();

		System.out.println(instructors.stream().mapToInt(data -> data.getId()));// .collect(Collectors.toList());

	}
}
