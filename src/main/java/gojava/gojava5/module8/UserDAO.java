package gojava.gojava5.module8;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public void deleteById(long id) {
        boolean flag = true;
        for (User user : dataBase) {
            if (user.getId() == id) {
                dataBase.remove(user);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("User with ID " + id + " is not found");
        }

        /* Lambda implementation without checking for absence:
        dataBase.stream()
                .filter(user -> user.getId() == id).forEach(user -> dataBase.remove(user));
        */
    }

    @Override
    public User get(long id) {
        boolean flag = true;
        for (User user : dataBase) {
            if (user.getId() == id) {
                System.out.println("User with ID = " + id + " found");
                flag = false;
                return user;
            }
        }
        if (flag) {
            System.out.println("User with ID = " + id + " is not found");
        }
        return null;
    }
}