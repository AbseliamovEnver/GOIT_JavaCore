package gojava.gojava5.module8;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public void deleteById(long id) {
        dataBase.removeIf(users -> users.getId() == id);
    }

    @Override
    public User get(long id) {
        return dataBase.stream().filter(user -> user.getId() == id)
                .findAny().orElse(new User(id, "Not found"));
    }
}