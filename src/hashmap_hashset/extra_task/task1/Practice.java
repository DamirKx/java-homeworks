package hashmap_hashset.extra_task.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        Warehouse<Product> warehouse = new Warehouse<>();


        warehouse.addCategory("Electronics");
        warehouse.addCategory("Office");
        warehouse.addCategory("Gaming");

        warehouse.addProductToSomeCategories(new ArrayList<>(Arrays.asList("Electronics", "Gaming")),
                new Laptop("asus", 500000, 10));
        warehouse.addProductToSomeCategories(new ArrayList<>(Arrays.asList("Electronics", "Office")),
                new Monitor("hp", 50000, 15));
        warehouse.addProductToSomeCategories(new ArrayList<>(Arrays.asList("Electronics", "Office")),
                new Keyboard("hp", 5000, 20));
        warehouse.addProductToSomeCategories(new ArrayList<>(Arrays.asList("Electronics", "Gaming")),
                new Mouse("aula", 8000, 10));



        Product productFindByName = warehouse.findByName("aula");
        if (productFindByName == null){
            System.out.println("товар не найден");
        } else {
            System.out.println("Товар " + productFindByName + " найден");
        }

        List<Product> productsFindbyCategory = warehouse.findByCategory("Gaming");
        if (productsFindbyCategory.isEmpty()){
            System.out.println("Такой категории нет или нет товаров по этой категории");
        } else {
            System.out.println("Товары из категории");
            for (Product product : productsFindbyCategory){
                System.out.println(product);
            }
        }
    }
}