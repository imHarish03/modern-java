package func.programming.general;

import func.programming.Instructor;
import func.programming.Instructors;

import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {

        List< Instructor> instructorList= Instructors.getAllInstructors();
        boolean allExperienced = instructorList.stream()
                .anyMatch(instructor -> instructor.getExpreience() > 5);

        if (allExperienced) {
            System.out.println("All instructors have more than 5 years of experience.");
        } else {
            System.out.println("Not all instructors have more than 5 years of experience.");
        }
    }
}
