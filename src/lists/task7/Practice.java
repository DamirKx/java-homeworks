package lists.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order("Иван", 5000, 3));
        orders.add(new Order("Мария", 8000, 2));  // Самая большая сумма -> должен быть первым
        orders.add(new Order("Олег", 5000, 10));  // Сумма как у Ивана, но товаров МНОГО -> должен обойти Ивана
        orders.add(new Order("Анна", 1500, 25));  // Товаров много, но сумма маленькая -> пойдет в конец

        System.out.println("До сортировки ");
        System.out.println(orders);

        Collections.sort(orders, new OrderComparator());

        System.out.println("После сортировки");
        System.out.println(orders);
    }
}
