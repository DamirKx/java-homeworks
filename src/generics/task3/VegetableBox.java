package generics.task3;

public class VegetableBox <K, T extends Vegetable>{
    private K key;
    private T obj;

    public VegetableBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "VegetableBox{" +
                "key=" + key +
                ", keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                ", objType=" + obj.getClass().getName() +
                '}';
    }
}
