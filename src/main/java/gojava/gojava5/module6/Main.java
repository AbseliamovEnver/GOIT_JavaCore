package gojava.gojava5.module6;

public class Main {
    public static void main(String[] args) {
        User [] users = new User[5];
        users[0] = new User(10L, "Ivan", "Ivanov", 5000, 20000);
        users[1] = new User(10L, "Ivan", "Ivanov", 5000, 20000);
        users[2] = new User(20L, "Petro", "Petrov", 6000, 30000);
        users[3] = new User(30L, "Sidr", "Sidorov", 4000, 10000);
        users[4] = new User(30L, "Sidr", "Sidorov", 4000, 10000);

        UserUtils user = new UserUtils();
        user.uniqueUsers(users);
        user.getUsersId(users);
        user.paySalaryToUsers(users);
        user.usersWithConditionalBalance(users, 36000);
        user.deleteEmptyUsers(users);
    }
}