package func.programming.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryExample {
	public static void main(String[] args) {

		UnaryOperator<String> dataOperator = String::toUpperCase;
		System.out.println(dataOperator.apply("harish"));
	}

}
