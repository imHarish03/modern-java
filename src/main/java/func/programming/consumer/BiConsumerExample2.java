package func.programming.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

public class BiConsumerExample2 {
	public static void main(String[] args) {
		List<Instructor> list = Instructors.getAllInstructors();

		BiConsumer<String, List<Courses>> biConsumer = (name, course) -> {
			System.out.println("Name: " + name + ", Course: " + course);
		};

		list.forEach(data -> {
			if (data.getId() > 1) {
				biConsumer.accept(data.getName(), data.getCourses());
			}
		}

		);

	}

}
