package generics.task3;

public class Practice {
    public static void main(String[] args) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

//        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
//        в классе Box мы указали что параметр T должен наследоваться от класса-родителя Fruit

        VegetableBox<String, Cabbage> cabbageVegetableBox  = new VegetableBox<>("cabbage", new Cabbage());
        cabbageVegetableBox.getObj().printClass();
    }
}