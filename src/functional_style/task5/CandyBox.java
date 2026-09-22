package functional_style.task5;

import java.util.List;

public class CandyBox {
    final String boxTitle;
    final List<Candy> candies;
    final long numberOfCandies;
    //добавьте конструктор
    public CandyBox(String boxTitle, List<Candy> candies) {
        this.boxTitle = boxTitle;
        this.candies = candies;
        this.numberOfCandies = candies.size();
    }

    private static final List<String> prohibitedProducers = List.of("Рахат");


    public static boolean isProducerAllowed(Candy candy) {
        return !prohibitedProducers.contains(candy.producer);
    }

    public void printContent() {
        System.out.println("Набор " + boxTitle
                + ", содержит " + numberOfCandies + " конфет");
        candies.forEach(candy ->
                System.out.println(candy.name + " производства " + candy.producer + ", цена: " + candy.price));
    }
}
