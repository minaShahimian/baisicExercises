package lambdas8.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>(Arrays.asList(
                "somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"
        ));
        objects.removeIf(e -> e.endsWith("e"));
        System.out.println(objects);
        objects.replaceAll(String::toUpperCase);
        System.out.println(objects);
        objects.removeIf(e -> e.length() < 6);
        System.out.println(objects);
        objects.forEach(System.out::println);

    }
}
