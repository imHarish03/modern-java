package func.programming.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream numbersByOf = IntStream.of(2, 10);
        numbersByOf.forEach(System.out::println);

        System.out.println("=======================================");
        IntStream iterate = IntStream.iterate(0, a-> a+3).limit(2);
        iterate.forEach(System.out::println);


        System.out.println("=======================================");
        IntStream numbers = IntStream.range(2, 10);
        numbers.forEach(System.out::println);

        System.out.println("=======================================");
        IntStream randomNumbers=IntStream.generate(new Random()::nextInt).limit(3);
        randomNumbers.forEach(System.out::println);

        System.out.println("=======================================");
        IntStream rangeClose = IntStream.rangeClosed(2, 10);
        rangeClose.forEach(System.out::println);

    }
}
