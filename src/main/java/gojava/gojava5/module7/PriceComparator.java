package gojava.gojava5.module7;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }
}