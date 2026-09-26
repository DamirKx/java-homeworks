package functional_style.extratask.task2;

import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Alex", "Bob", "Alexander",
                "Anna", "John", "Alice",
                "Bob", "Andrew"
        );

        List<String> newNames = names.stream()
                .distinct()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(newNames);
    }
}
