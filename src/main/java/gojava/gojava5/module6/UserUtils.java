package gojava.gojava5.module6;

import java.util.Arrays;

public class UserUtils {
    public User[] uniqueUsers(User[] users) {
        int countUniqueUsers = 0;
        User[] uniqueUsers = Arrays.copyOf(users, users.length);
        for (int i = 0; i < uniqueUsers.length - 1; i++) {
            for (int j = i + 1; j < uniqueUsers.length; j++) {
                if (uniqueUsers[i].equals(uniqueUsers[j])) {
                    uniqueUsers[i] = null;
                    uniqueUsers[j] = null;
                    i++;
                    j++;
                    break;
                } else {
                    countUniqueUsers++;
                }
            }
        }
        int indexUniqueUsers = 0;
        User[] resultUniqueUsers = new User[countUniqueUsers];
        for (int i = 0; i < uniqueUsers.length; i++) {
            if (uniqueUsers[i] == null) {
                continue;
            } else {
                resultUniqueUsers[indexUniqueUsers] = uniqueUsers[i];
                indexUniqueUsers++;
            }
        }
        return users;
    }

    public User[] usersWithConditionalBalance(User[] users, int balance) {
        int countUser = 0;
        User[] usersBalance = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            } else if (users[i].getBalance() == balance) {
                usersBalance[countUser] = users[i];
                countUser++;
            }
        }
        int indexUserBalance = 0;
        User[] resultUserBalance = new User[countUser];
        for (int i = 0; i < usersBalance.length; i++) {
            if (usersBalance[i] == null) {
                continue;
            } else {
                resultUserBalance[indexUserBalance] = usersBalance[i];
                indexUserBalance++;
            }
        }
        return usersBalance;
    }

    public final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            } else {
                users[i].setBalance(users[i].getBalance() + users[i].getSalary());
            }
        }
        return users;
    }

    public final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                continue;
            } else {
                id[i] = users[i].getId();
            }
        }
        return id;
    }

    public User[] deleteEmptyUsers(User[] users) {
        int countExistingUser = 0;
        User[] copyOfUsers = Arrays.copyOf(users, users.length);
        for (int i = 0; i < copyOfUsers.length; i++) {
            if (copyOfUsers[i] != null) {
                countExistingUser++;
            }
        }
        int indexExistingUser = 0;
        User[] resultExistingUsers = new User[countExistingUser];
        for (int i = 0; i < copyOfUsers.length; i++) {
            if (copyOfUsers[i] != null) {
                resultExistingUsers[indexExistingUser] = copyOfUsers[i];
                indexExistingUser++;
            }
        }
        return resultExistingUsers;
    }
}