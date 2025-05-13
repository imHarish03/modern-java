package func.programming.collection.sorting;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
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
