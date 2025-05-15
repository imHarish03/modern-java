package func.programming;

import java.util.List;

public class Instructor {
	private int id;
	private String name;
	private boolean online;
	private int expreience;
	private boolean isEnrolled;
	private List<Courses> courses;

	public Instructor(int id, String name, List<Courses> courses, boolean online, int expreience,boolean isEnrolled) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.online = online;
		this.expreience = expreience;
		this.isEnrolled=isEnrolled;
	}

	public int getExpreience() {
		return expreience;
	}

	public void setExpreience(int expreience) {
		this.expreience = expreience;
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

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public boolean isEnrolled() {
		return isEnrolled;
	}

}
