package gojava.gojava5.module7;

import java.util.Comparator;

public class ItemNameAndShopAndUserCityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.getItemName().equals(o2.getItemName())) {
            if (o1.getShopIdentificator().equals(o2.getShopIdentificator())) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        }
        return o1.getItemName().compareTo(o2.getItemName());
    }
}
