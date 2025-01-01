package func.programming.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Java 8 is powerful");
        List<String> words = sentences.stream().map(data -> data.split(" ")).flatMap(data -> Arrays.stream(data)).collect(Collectors.toList());
        words.forEach(System.out::println);
    }
}
