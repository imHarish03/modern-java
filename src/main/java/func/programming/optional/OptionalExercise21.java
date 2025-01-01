package func.programming.optional;

import java.util.List;
import java.util.Optional;

import func.programming.Car;
import func.programming.Insurance;

public class OptionalExercise21 {
	public static void main(String[] args) {

		List<Car> carList = Car.getListCars();
		Optional<Car> carOptional = carList.stream().filter(car -> car.getCareName().equalsIgnoreCase("Swift"))
				.findFirst();

		String nameString = carOptional.isPresent() ? getInsurancePolicy(carOptional.get()) : "Unknown";
		nameString = carOptional.map(OptionalExercise21::getInsurancePolicy).orElse("Unknown");

		System.out.println(nameString);

	}

	public static String getInsurancePolicy(Car carOptional) {
		return Optional.ofNullable(carOptional).map(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
	}

}
