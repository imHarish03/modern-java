package func.programming.flatmap;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Flatten2DArrayExample {

    public static void main(String[] args) {

        String[][] array2D = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };

        List<String[]> out2 = Arrays.stream(array2D).collect(Collectors.toList());
        out2.stream().forEach(innerData -> {

            for (int i = 0; i < innerData.length; i++)
                System.out.println("Iteration: "+innerData[i]);
        });

        List<String> out = Arrays.stream(array2D).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(out);
    }

}
