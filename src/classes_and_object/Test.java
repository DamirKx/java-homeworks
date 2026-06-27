package classes_and_object;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("toyota", "camry", 100);
        Car car2 = new Car(car1.brand, "crv", 90);

        car1.start();
        car2.start();

        car1.stop();
        car2.stop();

        System.out.println(car1.brand +" " + car1.model + " " + car1.speed);
        System.out.println(car2.brand +" " + car2.model + " " + car2 .speed);
    }
}
