package func.programming.stream;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.range(0, 100).sum();
        System.out.println(sum);

        OptionalInt min = IntStream.generate(new Random()::nextInt).limit(10).min();
        System.out.println(min.getAsInt());
    }

}
