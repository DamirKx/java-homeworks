package lists.task7;

public class Order {
    String client;
    int totalPrice;
    int productCount;

    public Order(String client, int totalPrice, int productCount) {
        this.client = client;
        this.totalPrice = totalPrice;
        this.productCount = productCount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "client='" + client + '\'' +
                ", totalPrice=" + totalPrice +
                ", productCount=" + productCount +
                '}';
    }
}
