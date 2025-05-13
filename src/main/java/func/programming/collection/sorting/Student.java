package func.programming.collection.sorting;

public class Student implements Comparable<Student> {

    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student st){
        System.out.println("Comparing "+this.name+" with "+st.name);
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
