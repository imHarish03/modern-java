package func.programming.flatmap;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        // Using flatMap with a lambda expression
        List<String> flattenedList = nestedList.stream()
                .flatMap(list -> list.stream()) // Flatten the nested lists
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [a, b, c, d, e, f]


        List<Instructor> list = Instructors.getAllInstructors();
        List<String> data = list.stream()
                //.map(Instructor::getCourses)
                .flatMap(courseInfo-> courseInfo.getCourses().stream()).map(Courses::getName).collect(Collectors.toList());

        System.out.println(data);
    }
}
