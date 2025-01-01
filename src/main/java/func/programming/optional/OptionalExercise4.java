package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Customer;
import func.programming.LoyaltyCard;

public class OptionalExercise4 {
	public static void main(String[] args) {
		List<Customer> customerList = Customer.getList();
		Customer customer = customerList.stream().filter(cus -> cus.getName() == "Vinod").findFirst().orElse(null);

		boolean isEligible = isCustomerEligibleForReward(customer, 0);
		System.out.println(isEligible);

		System.out.println(getLoyaltyCardPoints(customer).orElse(0));
	}

	private static boolean isCustomerEligibleForReward(Customer customer, int threshold) {
		return Optional.ofNullable(customer).map(Customer::getLoyaltyCard).map(LoyaltyCard::getPoints)
				.map(point -> point > threshold).orElse(false);
	}

	private static Optional<Integer> getLoyaltyCardPoints(Customer customer) {
		return Optional.ofNullable(customer).map(Customer::getLoyaltyCard).map(LoyaltyCard::getPoints);
	}
}
