package func.programming;

import java.util.Arrays;
import java.util.List;

public class Instructors {

	public static List<Instructor> getAllInstructors() {
		Instructor instructor1 = new Instructor(1, "Hari", Arrays.asList(new Courses(1, "Java"), new Courses(2, "SQL"),new Courses(3, "Angular"), new Courses(4, "JavaScript")), true, 7);
		Instructor instructor2 = new Instructor(2, "Vinod", Arrays.asList(new Courses(3, "Angular"), new Courses(4, "JavaScript"),new Courses(5, "Java")), false, 5);
		Instructor instructor3 = new Instructor(3, "Balaji", Arrays.asList(new Courses(5, "Java")), false, 8);
		Instructor instructor4 = new Instructor(4, "Anjali", Arrays.asList(new Courses(6, "SQL"), new Courses(7, "QA")), true, 6);
		Instructor instructor5 = new Instructor(5, "Suresh", Arrays.asList(new Courses(8, "JavaScript"), new Courses(9, "Android")), true, 10);
		Instructor instructor6 = new Instructor(6, "Neha", Arrays.asList(new Courses(10, "Angular")), false, 3);
		Instructor instructor7 = new Instructor(7, "Ravi", Arrays.asList(new Courses(11, "Java"), new Courses(12, "QA")), true, 4);
		Instructor instructor8 = new Instructor(8, "Manisha", Arrays.asList(new Courses(13, "SQL"), new Courses(14, "JavaScript")), false, 9);
		Instructor instructor9 = new Instructor(9, "Pooja", Arrays.asList(new Courses(15, "Android"), new Courses(16, "QA")), true, 5);
		Instructor instructor10 = new Instructor(10, "Ajay", Arrays.asList(new Courses(17, "Java"), new Courses(18, "SQL")), false, 7);
		Instructor instructor11 = new Instructor(11, "Amit", Arrays.asList(new Courses(19, "Angular"), new Courses(20, "JavaScript")), true, 8);
		Instructor instructor12 = new Instructor(12, "Kiran", Arrays.asList(new Courses(21, "QA"), new Courses(22, "Android")), false, 6);
		Instructor instructor13 = new Instructor(13, "Sita", Arrays.asList(new Courses(23, "Java"), new Courses(24, "JavaScript")), true, 7);
		Instructor instructor14 = new Instructor(14, "Ramesh", Arrays.asList(new Courses(25, "SQL"), new Courses(26, "Angular")), false, 5);
		Instructor instructor15 = new Instructor(15, "Deepak", Arrays.asList(new Courses(27, "QA")), true, 10);

		List<Instructor> instructors = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5, instructor6, instructor7, instructor8, instructor9, instructor10, instructor11, instructor12, instructor13, instructor14, instructor15);
		return instructors;
	}

}
