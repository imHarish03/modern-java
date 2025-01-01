package func.programming.binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<String> dataBinaryOperator = (dat1, data2) -> dat1.concat(data2);
		System.out.println(dataBinaryOperator.apply("Hari", " haran"));

		Comparator<Integer> compareComparator = (a, b) -> a.compareTo(b);
		// System.out.println(compareComparator.compare(21, 3));

		BinaryOperator<Integer> minBy = BinaryOperator.maxBy(compareComparator);
		System.out.println(minBy.apply(23, 45));
	}

}
