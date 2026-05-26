package lists.task5;

public class Practice {
    public static void main(String[] args) {
        ServiceSystem serviceSystem = new ServiceSystem();
        serviceSystem.add(new Client("Tom", false));
        serviceSystem.add(new Client("Mark", true));
        serviceSystem.add(new Client("John", true));
        serviceSystem.add(new Client("Sam", false));
        serviceSystem.add(new Client("Miles", false));

        serviceSystem.printClients();

        serviceSystem.service();
    }
}