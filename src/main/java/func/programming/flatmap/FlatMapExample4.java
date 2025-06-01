package func.programming.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapExample4 {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Hari", "Vinod"),
                Arrays.asList("Alex", "John")
        );

        listOfLists.stream().flatMap(users->users.stream()).forEach(System.out::println);


        /// Problem 2: Extract words from sentences
        List<String> sentences = Arrays.asList(
                "Java is awesome",
                "Streams are powerful"
        );

        List<String> demo = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
        System.out.println(demo);


        /// Problem 3: Unique characters in words
        List<String> words = Arrays.asList("Hello", "World");
        words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).distinct().forEach(System.out::println);


        List<Optional<String>> optionalList = Arrays.asList(
                Optional.of("Hari"),
                Optional.empty(),
                Optional.of("Vinod")
        );

        List<String> nameList=optionalList.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
        nameList.forEach(System.out::println);

    }
}
