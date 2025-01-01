package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Car;
import func.programming.Insurance;

public class OptionalExercise2 {
	public static void main(String[] args) {
		List<Car> carList = Car.getListCars();
		Optional<Car> carInfo = carList.stream().filter(carData -> carData.getCareName().equalsIgnoreCase("Innova"))
				.findFirst();

		String policyName = getCarInsurancePolicyName(carInfo.orElse(null)).orElse("Unknown");
		System.out.println(policyName); // Output will depend on the data
	}

	public static Optional<String> getCarInsurancePolicyName(Car car) {
		return Optional.ofNullable(car) // Handle potential null Car
				.map(Car::getInsurance) // Navigate to Insurance
				.map(Insurance::getName);
	}

}
