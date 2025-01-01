package func.programming.stream;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args) {
        Predicate<Instructor> onlineCourse = data -> data.isOnline();
        Predicate<Instructor> experience = data -> data.getExpreience() > 5;

        List<Instructor> sourceData = Instructors.getAllInstructors();
        Map<String, List<Courses>> data = sourceData.stream().filter(onlineCourse).filter(experience).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(data);

    }
}
