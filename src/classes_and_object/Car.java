package classes_and_object;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    void start(){
        System.out.println("start");
    }


    void stop(){
        System.out.println("stop");
    }
}
