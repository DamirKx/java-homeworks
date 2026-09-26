package functional_style.extratask.task3;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(
                3, 7, 10, 15, 20, 25, 30
        );


        Integer sumOfNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .sum();

        System.out.println(sumOfNumbers);

        Integer sumOfNumberWithReduce = numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(sumOfNumberWithReduce);
    }
}
