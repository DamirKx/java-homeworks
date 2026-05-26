package lists.task2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        if (products.contains(product)){
            for (Product product1 : products){
                if (product.name.equals(product1.name)){
                    product1.quantity += product.quantity;
                    return;
                }
            }
        } else {
            products.add(product);
            System.out.println("Товар добавлен");
        }
    }

    public void deleteProduct(Product product){
        if (products.contains(product)){
            for (int i = 0; i < products.size(); i++){
                if (product.equals(products.get(i))){
                    products.remove(i);
                    System.out.println("Товар удален");
                    return;
                }
            }
        } else {
            System.out.println("Товар не найден");
        }
    }

    public int sumOfBasket(){
        if (products.isEmpty()){
            return 0;
        } else {
            int sum = 0;
            for (Product product :products){
                sum += product.price * product.quantity;
            }
            return sum;
        }
    }

    public void searchProductByName(String name){
        for (Product product : products){
            if (product.name.equals(name)){
                System.out.println("Товар найден: " + product.name);
                return;
            }
        }
        System.out.println("Товар не найден");
    }

    public void discountOnProduct(){
        for (Product product : products){
            if (product.price > 10000){
                product.price = (int) (product.price - (product.price * 0.15));
            }
        }
    }

    public String expensiveProduct() {
        if (!products.isEmpty()) {
            int price = 0;
            String name = "";
            for (Product product : products) {
                if (product.price > price) {
                    name = product.name;
                    price = product.price;
                }
            }
            return name;
        }
        return "Корзина пустая";
    }
}
