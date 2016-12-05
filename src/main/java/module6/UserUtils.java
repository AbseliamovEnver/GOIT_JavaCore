package main.java.module6;

public class UserUtils {
    public User[] uniqueUsers(User[] users) {
        int countUniqueUsers = 0;
        User[] uniqueUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (i == j) {
                    continue;
                } else if (users[i].getId() == users[j].getId()
                        && users[i].getFirstName().equals(users[j].getFirstName())
                        && users[i].getLastName().equals(users[j].getLastName())
                        && users[i].getSalary() == users[j].getSalary()
                        && users[i].getBalance() == users[j].getBalance()) {
                    continue;
                } else {
                    uniqueUsers[countUniqueUsers] = users[i];
                    countUniqueUsers++;
                }
            }
        }
        return uniqueUsers;
    }

    public User[] usersWithConditionalBalance(User[] users, int balance) {
        int countUser = 0;
        User[] usersBalance = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                usersBalance[i] = users[i];
                countUser++;
            }
        }
        User[] usersWithRequiredBalance = new User[countUser];
        for (int j = 0; j < usersBalance.length; j++) {
            if (usersBalance[j] != null) {
                usersWithRequiredBalance[j] = usersBalance[j];
            }
        }
        return usersWithRequiredBalance;
    }

    public final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    public final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            id[i] = users[i].getId();
        }
        return id;
    }

    public User[] deleteEmptyUsers(User[] users) {

        return users;
    }
}
