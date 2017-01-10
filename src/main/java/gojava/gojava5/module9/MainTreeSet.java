package gojava.gojava5.module9;

import gojava.gojava5.module7.Currency;
import gojava.gojava5.module7.Order;
import gojava.gojava5.module7.User;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MainTreeSet {
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

        TreeSet<Order> setOrders = new TreeSet<>();

        setOrders.add(new Order(1, 20000, Currency.UAH, "Notebook", "Allo", users.get(0)));
        setOrders.add(new Order(2, 10000, Currency.UAH, "Smartphone", "Citrus", users.get(1)));
        setOrders.add(new Order(3, 500, Currency.USD, "Smartwatch", "Amazon", users.get(2)));
        setOrders.add(new Order(4, 8000, Currency.UAH, "Computer", "Comfy", users.get(3)));
        setOrders.add(new Order(5, 1000, Currency.USD, "Monitor 4K", "Ebay", users.get(4)));
        setOrders.add(new Order(6, 800, Currency.USD, "Notebook", "Amazon", users.get(5)));
        setOrders.add(new Order(7, 10000, Currency.UAH, "Software", "Notus", users.get(6)));
        setOrders.add(new Order(8, 900, Currency.USD, "Notebook", "Ebay", users.get(7)));
        setOrders.add(new Order(9, 500, Currency.USD, "PC Desktop", "Amazon", users.get(8)));
        setOrders.add(new Order(5, 1000, Currency.USD, "Monitor 4K", "Ebay", users.get(4)));

        System.out.println("Original list:\n" + setOrders);

        String userLastName = "Petrov";
        boolean foundOrderbyName = setOrders.stream()
                .anyMatch(order -> order.getUser().getLastName().equals(userLastName));
        if (foundOrderbyName) {
            System.out.println("User {" + userLastName + "} is found\n");
        } else {
            System.out.println("User {" + userLastName + "} is not found\n");
        }

        Order orderWithLargestPrice = setOrders.last();
        System.out.println("Order with largest price:\n " + orderWithLargestPrice);


        setOrders.removeIf(order -> order.getCurrency().equals(Currency.USD));
        System.out.println("Orders without currency USD:\n " + setOrders);
    }
}