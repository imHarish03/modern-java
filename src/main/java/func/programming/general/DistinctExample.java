package func.programming.general;

import func.programming.Courses;
import func.programming.Instructor;
import func.programming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAllInstructors();

        List<String> uniqueCourse = instructorList.stream()
                //  .map(Instructor::getCourses)
                .flatMap(dataList -> dataList.getCourses().stream())
                .map(Courses::getName).
                distinct().collect(Collectors.toList());

        uniqueCourse.forEach(System.out::println);


        System.out.println("=====================");
        Set<String> useSet = instructorList.stream()
                //  .map(Instructor::getCourses)
                .flatMap(dataList -> dataList.getCourses().stream())
                .map(Courses::getName)
                //.distinct()
                .collect(Collectors.toSet());

        useSet.forEach(System.out::println);


        System.out.println("=====CountExample=========");
        int dataCount = (int) instructorList.stream()
                //  .map(Instructor::getCourses)
                .flatMap(dataList -> dataList.getCourses().stream())
                .map(Courses::getName).distinct().count();
        System.out.println(dataCount);

    }
}
