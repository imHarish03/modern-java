package func.programming.predicate;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample2 {
	public static void main(String[] args) {
		Predicate<Instructor> isEnrolled=instructor -> instructor.isEnrolled();
		Predicate<Instructor> isofferingMoreThan4Courses=instructor -> instructor.getCourses().size()>4;

		Function<String,String> upperCaseFunction=data->data.toUpperCase();
		BiConsumer<String, List<Courses>> printNameConsumer = (name, course) -> System.out.println(name + " is offering courses on " + course);

		List<Instructor> instructors = Instructors.getAllInstructors();

		instructors.forEach(data -> {
			if (isEnrolled.and(isofferingMoreThan4Courses).test(data)) {
				printNameConsumer.accept(upperCaseFunction.apply(data.getName()), data.getCourses());
			}
		});
	}
}
