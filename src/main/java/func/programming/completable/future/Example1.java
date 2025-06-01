package func.programming.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        CompletableFuture<Integer> totalMarks=CompletableFuture.supplyAsync(()->446);

        Function<Integer,Integer> avg=marks-> marks/5;

        CompletableFuture<Integer> average=totalMarks.thenApply(avg);
        System.out.println(average.join());
    }
}
