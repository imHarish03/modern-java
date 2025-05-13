package func.programming.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",25));
        al.add(new Student(106,"Jai",27));
        al.add(new Student(104,"Vinod",32));
        al.add(new Student(105,"Ajay",35));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        Collections.sort(al,new AgeComparator());
        System.out.println("After sorting by age");
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        Collections.sort(al, (s1, s2) -> s1.age<s2.age?1:-1);
        System.out.println("After sorting by name");
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

