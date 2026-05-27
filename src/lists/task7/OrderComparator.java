package lists.task7;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if (o1.totalPrice > o2.totalPrice){
            return -1;
        } else if (o1.totalPrice == o2.totalPrice){
            return Integer.compare(o2.productCount, o1.productCount);
        } else{
            return 1;
        }
    }
}
