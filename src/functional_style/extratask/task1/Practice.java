package functional_style.extratask.task1;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 7, 20, 3, 18, 25, 10, 14, 9);

        List<Integer> newNumbers = numbers.stream()
                .filter(number -> number % 2 == 0 && number > 10)
                .map(number -> number * 2)
                .sorted()
                .toList();

        System.out.println(newNumbers);

    }
}
