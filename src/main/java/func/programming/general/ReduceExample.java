package func.programming.general;

import func.programming.Instructor;
import func.programming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceExample {

    public static void main(String[] args) {
        List<Instructor> dataList = Instructors.getAllInstructors();
        Optional<Integer> maxExperience = dataList.stream().map(Instructor::getExpreience).min(Integer::compare);
        System.out.println(maxExperience.get());

        dataList = dataList.stream().sorted((data1, data2) -> data2.getExpreience() > data1.getExpreience() ? 1 : -1)
                .peek(subj -> System.out.println(subj.getName() + "--->" + subj.getExpreience()))
                .skip(2).limit(1).collect(Collectors.toList());
        System.out.println("====OutData====");
        dataList.forEach(info -> System.out.println(info.getName() + "--->" + info.getExpreience()));


        int experienceSum = Instructors.getAllInstructors().stream().map(Instructor::getExpreience)
                //.reduce(0,experienceInfo-> Integer.sum(0,experienceInfo));
                .reduce(0, (a, b) -> a + b);
        System.out.println("Experience Sum: " + experienceSum);

        Optional<Integer> info = Instructors.getAllInstructors().stream().map(Instructor::getExpreience)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println("Experience info by Reduce: " + info.get());
    }
}
