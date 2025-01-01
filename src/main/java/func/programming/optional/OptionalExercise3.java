package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Address;
import func.programming.User;

public class OptionalExercise3 {

	public static void main(String[] args) {
		List<User> userList = User.getList();
		User user = userList.stream().filter(d -> d.getId() == 2).findFirst().orElse(null);

		System.out.println(getUserCityName(user));
	}

	private static String getUserCityName(User user) {
		return Optional.ofNullable(user).map(User::getAddress).map(Address::getCity).orElse("City not provided");
	}

}
