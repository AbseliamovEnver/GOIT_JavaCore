package gojava.gojava5.module8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserDAO users = new UserDAO();
        users.save(new User(1L, "Ivan"));
        users.save(new User(2L, "Petro"));
        users.save(new User(3L, "Nikolay"));
        users.save(new User(4L, "Vasya"));

        List<User> usersList = new ArrayList<>();
        usersList.add(new User(10L, "Svetlana"));
        usersList.add(new User(11L, "Olga"));
        usersList.add(new User(10L, "Victory"));

        System.out.println("Original users list:\n" + users.getList() + "\n");

        users.save(new User(5L, "Michail"));
        System.out.println("After saving a new user:\n" + users.getList() + "\n");

        users.delete(new User(3L, "Nikolay"));
        System.out.println("After removing the user:\n" + users.getList() + "\n");

        users.saveAll(usersList);
        System.out.println("After saving All user List:\n" + users.getList() + "\n");

        users.deleteAll(usersList);
        System.out.println("After delete All user List:\n" + users.getList() + "\n");

        users.deleteById(4L);
        System.out.println("After delete By Id user:\n" + users.getList() + "\n");

        System.out.println(users.get(10L) + "\n");
        System.out.println("The adjusted list users:\n" + users.getList() + "\n");
    }
}