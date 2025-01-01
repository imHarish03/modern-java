package func.programming.optional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import func.programming.Student;

public class OptionalExercise61 {
	public static void main(String[] args) {
		
		List<Student> studentInfo = Student.studentList();
		studentInfo = findStudent(studentInfo, 2);

		studentInfo.forEach(s -> {
			System.out.println(s.getName() + "--" + s.getTotal());
		});
	}

	private static List<Student> findStudent(List<Student> studentInfo, int i) {
		return studentInfo.stream().map(Student::getTotal).distinct().sorted(Comparator.reverseOrder()).skip(i).limit(1)
				.flatMap(requiredMark -> studentInfo.stream().filter(student -> student.getTotal() == requiredMark))
				.collect(Collectors.toList());
	}

}
