package func.programming.collection.sorting.practice;

import func.programming.collection.sorting.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Hari", 29, 8));
        employeeList.add(new Employee(2, "Anu", 27,3));
        employeeList.add(new Employee(3, "Vinod", 33,9));
        employeeList.add(new Employee(4, "Bala", 32,8));

        Collections.sort(employeeList,(emp1,emp2)->{
            if(emp1.getExperience() > emp2.getExperience()){
                return -1;
            }else if(emp1.getExperience() < emp2.getExperience()){
                return 1;
            }else{
                return 0;
            }
        });

    String empNames=     employeeList.stream().map(emp-> emp.getName()).collect(Collectors.joining(", "));
    System.out.println("empNames = " + empNames);
    }
}
