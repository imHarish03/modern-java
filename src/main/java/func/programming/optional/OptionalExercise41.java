package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Customer;

public class OptionalExercise41 {
	public static void main(String[] args) {
		List<Customer> customers = Customer.getList();
		Optional<Customer> cInfOptional = customers.stream().filter(data -> data.getName().equals("Hari")).findFirst();
		System.out.println(getCustomerLoyalty(5, cInfOptional.orElse(null)));

	}

	public static boolean getCustomerLoyalty(int threshold, Customer customer) {
		return Optional.ofNullable(customer).map(Customer::getLoyaltyCard)
				.map(loyalty -> loyalty.getPoints() > threshold).orElse(false);
	}

}
