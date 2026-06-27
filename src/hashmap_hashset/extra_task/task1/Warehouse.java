package hashmap_hashset.extra_task.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Warehouse <T extends Product>{
    HashMap<String, List<T>> products = new HashMap<>();

    public void addCategory(String category){
        if (!products.containsKey(category)){
            products.put(category, new ArrayList<>());
            System.out.println("категория " + category + " добавлена" );
        }
    }

    public void addProductToCategory(String category, T product){
        if (products.containsKey(category)){
            products.get(category).add( product);
            System.out.println("Товар " + product + " добавлен в категорию "+ category);
        } else {
            System.out.println("Такой категории нет!");
        }
    }

    public void addProductToSomeCategories(List<String> categories, T product){
        for (String category : categories){
            addProductToCategory(category, product);
        }
    }

    public List<T> findByCategory(String category){
        if (products.containsKey(category)){
            return products.get(category);
        }
        return new ArrayList<>();
    }

    public T findByName(String name){
        for (List<T> list : products.values()){
            for (T product : list){
                if (product.getName().equals(name)){
                    return product;
                }
            }
        }
        return null;
    }
}