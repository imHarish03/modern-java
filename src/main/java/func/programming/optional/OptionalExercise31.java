package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Address;
import func.programming.User;

public class OptionalExercise31 {

	public static void main(String[] args) {
		List<User> users = User.getList();

		Optional<User> user = users.stream().filter(info -> info.getId() == 3).findFirst();
		String cityString = user.map(OptionalExercise31::getUserCity).orElse("City not provided");

		System.out.println(cityString);
	}

	public static String getUserCity(User user) {
		return Optional.ofNullable(user).map(User::getAddress).map(Address::getCity).orElse("City not provided");
	}

}
