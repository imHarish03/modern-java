package func.programming.predicate;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		Predicate<Integer> p1 = (i1) -> i1 > 10;
		Predicate<Integer> p2 = i1 -> i1 % 2 == 0;

		System.out.println(p1.or(p2).test(99));

		System.out.println(p1.or(p2.negate()).test(2));

	}

}
