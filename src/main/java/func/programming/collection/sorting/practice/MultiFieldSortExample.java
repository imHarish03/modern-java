package func.programming.collection.sorting.practice;

import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class MultiFieldSortExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ajay", 22));
        students.add(new Student("Vijay", 20));
        students.add(new Student("Ajay", 20));
        students.add(new Student("Raj", 25));

        // Sort by name, then by age
        students.sort(
            Comparator.comparing(Student::getName,Comparator.reverseOrder())
                      .thenComparing(Student::getAge)
        );

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
