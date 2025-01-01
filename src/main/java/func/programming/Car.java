package func.programming;

import java.util.Arrays;
import java.util.List;

public class Car {

	private int carid;
	private String careName;
	private Insurance insurance;

	public Car(int carid, String careName, Insurance insurance) {
		this.carid = carid;
		this.careName = careName;
		this.insurance = insurance;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCareName() {
		return careName;
	}

	public void setCareName(String careName) {
		this.careName = careName;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public static List<Car> getListCars() {
		return Arrays.asList(new Car(2, "Innova", new Insurance("Toyota")), new Car(3, "Swift", new Insurance()));
	}

}
