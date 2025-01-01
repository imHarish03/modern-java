package func.programming;

import java.util.Arrays;
import java.util.List;

public class Customer {
	private String name;
	private LoyaltyCard loyaltyCard;

	public Customer(String name, LoyaltyCard loyaltyCard) {
		this.name = name;
		this.loyaltyCard = loyaltyCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LoyaltyCard getLoyaltyCard() {
		return loyaltyCard;
	}

	public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
		this.loyaltyCard = loyaltyCard;
	}

	public static List<Customer> getList() {
		return Arrays.asList(new Customer("Hari", null), new Customer("Vinod", new LoyaltyCard(10)));
	}

}
