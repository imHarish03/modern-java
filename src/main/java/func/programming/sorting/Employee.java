package func.programming.sorting;

public class Employee implements  Comparable<Employee>{
    int id;
    String name;
    int age;
    int experience;
    public Employee(int id, String name, int age, int experience) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.experience==o.experience){
            return 0;
        } else if (o.experience > this.experience) {
            return 1;
        }else if(o.experience< this.experience){
            return -1;
        }else{
            return 0;
        }
    }
}
