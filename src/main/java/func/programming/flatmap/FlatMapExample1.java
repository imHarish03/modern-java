package func.programming.flatmap;

import func.programming.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample1 {

    public static void main(String[] args) {

        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);


        Set<String> bookInfo = list.stream().flatMap(developerInfo -> developerInfo.getBook().stream()).filter(bookTest -> bookTest.toLowerCase().contains("java")).collect(Collectors.toSet());
        bookInfo.stream().forEach(System.out::println);

    }

}
