package junit_tests.extra_tasks.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Test
    void testWithList(){
        OrderService orderService = new OrderService();

        List<Product> products = List.of(
                new Product("Mouse", 15000),
                new Product("Keyboard", 30000),
                new Product("Monitor", 120000),
                new Product("Headphones", 45000)
        );
        Product mostExpensive = orderService.findMostExpensive(products);

        double expected = 210000;
        assertEquals(expected, orderService.calculateTotal(products));

        assertAll("Проверка самого дорогого продукта",
                () -> assertEquals("Monitor", mostExpensive.getName()),
                () -> assertEquals(120000, mostExpensive.getPrice())
                );

    }

    @Test
    void testWithEmptyList(){

        OrderService orderService = new OrderService();

        List<Product> products = new ArrayList<>();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> orderService.findMostExpensive(products));

        assertEquals("Список пуст", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(doubles = {120000, 30000, 15000, 45000})
    void testCalculateTotalWithSingleProduct(double price) {
        OrderService orderService = new OrderService();
        List<Product> products = List.of(new Product("Item", price));

        assertEquals(price, orderService.calculateTotal(products));
    }

    @ParameterizedTest
    @CsvSource({"Monitor, 120000",
                "Keyboard, 30000",
                "Mouse, 15000",
                "Headphones, 45000"})
    void testWithOneValueList(String name, double price) {
        OrderService orderService = new OrderService();

        List<Product> products = List.of(new Product(name, price));

        double totalSum = orderService.calculateTotal(products);
        Product mostExpensive = orderService.findMostExpensive(products);

        assertAll("Проверка списка с одним товаром",
                () -> assertEquals(price, totalSum),
                () -> assertEquals(name, mostExpensive.getName())
                );
    }
}
