package func.programming.consumer;

import java.util.List;
import java.util.function.Consumer;

import func.programming.Instructor;
import func.programming.Instructors;

public class ConsumerExample2 {

	public static void main(String[] args) {

		Consumer<Instructor> c1 = (instructor) -> System.out.println(instructor.getId());
		Consumer<Instructor> c2 = (instructor) -> System.out.println(instructor.getName());
		Consumer<Instructor> c3 = (instructor) -> System.out.println(instructor.getCourses());

		List<Instructor> instructors = Instructors.getAllInstructors();
		// instructors.forEach(c1.andThen(c2).andThen(c3));

		instructors.forEach(s1 -> {
			if (s1.getId() > 1) {
				c1.andThen(c2).andThen(c3).accept(s1);
			}
		});
	}
}
