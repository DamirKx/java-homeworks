package generics.task1;

public class Practice {
    public static void main(String[] args) {
        Box<String> sample1 = new Box<>("runtime");
        System.out.println(sample1);

//        Box<String> sample2 = new Box<>(1); // в качестве типа параметра был указан String а в конструкторе указали целое число
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);

        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
