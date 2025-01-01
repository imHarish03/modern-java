package func.programming.defaultMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {
	public static void main(String[] args) {
		List<String> userNameStrings = Arrays.asList("Hari", "Vishwa", "Anu", "Sathish");
		userNameStrings.sort(Comparator.naturalOrder());

		System.out.println(userNameStrings);
	}
}
