package lists.task5;

public class Client {
    String name;
    boolean isVip;

    public Client(String name, boolean isVip) {
        this.name = name;
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
