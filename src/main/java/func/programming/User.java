package func.programming;

import java.util.Arrays;
import java.util.List;

public class User {
	private int id;
	private String nameString;
	private Address address;

	public User(int id, String nameString, Address address) {
		this.id = id;
		this.nameString = nameString;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static List<User> getList() {

		return Arrays.asList(new User(1, "Hari", new Address("Covai")), new User(2, "Vinod", new Address()),
				new User(3, "bala", null));

	}

}
