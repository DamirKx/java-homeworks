package junit_tests.extra_tasks.task3;

import java.util.Comparator;
import java.util.List;

public class OrderService {
    public double calculateTotal(List<Product> products) {
        // Реализуйте
        double totalSum = 0;
        for (Product product : products) {
            totalSum += product.getPrice();
        }
        return totalSum;
    }
    public Product findMostExpensive(List<Product> products) {
        // Реализуйте
        return products.stream().max(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new IllegalArgumentException("Список пуст"));
    }
}

