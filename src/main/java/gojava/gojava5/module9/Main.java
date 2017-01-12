package gojava.gojava5.module9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ivan", "Ivanov", "Kiev", 30000));
        users.add(new User(2, "Petr", "Petrov", "Lvov", 20000));
        users.add(new User(3, "Sidr", "Sidorov", "Kharkov", 3000));
        users.add(new User(4, "Victoria", "Victorova", "Poltava", 15000));
        users.add(new User(5, "Anna", "Aleksandrova", "Nikolaev", 12000));
        users.add(new User(6, "Natalia", "Nikolaevna", "Sumy", 8000));
        users.add(new User(7, "Aleksandr", "Aleksandrov", "Dnepr", 25000));
        users.add(new User(8, "Nikolay", "Nikolaev", "Odessa", 5000));
        users.add(new User(9, "Mihail", "Mihailov", "Vinnitsa", 6000));
        users.add(new User(10, "Zahar", "Zaharov", "Rovno", 7000));

        List<Order> listOrders = new ArrayList<>();

        listOrders.add(new Order(1, 20000, Currency.UAH, "Notebook", "Allo", users.get(0)));
        listOrders.add(new Order(2, 10000, Currency.UAH, "Smartphone", "Citrus", users.get(1)));
        listOrders.add(new Order(3, 500, Currency.USD, "Smartwatch", "Amazon", users.get(2)));
        listOrders.add(new Order(4, 8000, Currency.UAH, "Computer", "Comfy", users.get(3)));
        listOrders.add(new Order(5, 1000, Currency.USD, "Monitor 4K", "Ebay", users.get(4)));
        listOrders.add(new Order(6, 800, Currency.USD, "Notebook", "Amazon", users.get(5)));
        listOrders.add(new Order(7, 10000, Currency.UAH, "Software", "Notus", users.get(6)));
        listOrders.add(new Order(8, 900, Currency.USD, "Notebook", "Ebay", users.get(7)));
        listOrders.add(new Order(9, 500, Currency.USD, "PC Desktop", "Amazon", users.get(8)));
        listOrders.add(new Order(5, 1000, Currency.USD, "Monitor 4K", "Ebay", users.get(4)));

        System.out.println("Original list:\n" + listOrders);

        listOrders.sort(Comparator.comparing(Order::getPrice).reversed());
        System.out.println("Sorted list by Order price in decrease order:\n" + listOrders);

        listOrders.sort(Comparator.comparing(Order::getPrice)
                .thenComparing(Comparator.comparing(order -> order.getUser().getCity())));
        System.out.println("Sorted list by Order price in increase order AND User city:\n" + listOrders);

        listOrders.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
                .thenComparing(Comparator.comparing(order -> order.getUser().getCity())));
        System.out.println("Sorted list by Order itemName AND ShopIdentificator AND User city:\n" + listOrders);

        List<Order> withoutDuplicatesOrders = listOrders.stream().distinct().collect(Collectors.toList());
        System.out.println("Order without duplicates:\n" + withoutDuplicatesOrders);

        List<Order> expensiveItemsOrder = listOrders.stream().filter(order -> order.getPrice() > 1500)
                .collect(Collectors.toList());
        System.out.println("Order of elements where the price is less than 1500:\n" + expensiveItemsOrder);

        Map<Currency, List<Order>> orderByCurrency = listOrders.stream()
                .collect(Collectors.groupingBy(Order::getCurrency));
        System.out.println("Separated lists orders by currencies:\n" + orderByCurrency);

        Map<String, List<Order>> orderByCities = listOrders.stream()
                .collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        System.out.println("Separated lists orders by cities:\n" + orderByCities);
    }
}