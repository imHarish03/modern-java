package func.programming;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private int total;

	public Student(int id, String name, int total) {
		this.id = id;
		this.name = name;
		this.total = total;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static List<Student> studentList() {
		return Arrays.asList(new Student(1, "Hari", 97), new Student(2, "Vino", 98), new Student(3, "Anu", 96),
				new Student(4, "ashok", 96));

	}

}
