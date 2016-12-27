package gojava.gojava5.module8;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    public List<T> dataBase = new LinkedList<>();

    @Override
    public T save(T object) {
        dataBase.add(object);
        return object;
    }

    @Override
    public void delete(T object) {
        dataBase.remove(object);
    }

    @Override
    public void deleteAll(List<T> object) {
        dataBase.removeAll(object);
    }

    @Override
    public void saveAll(List<T> object) {
        dataBase.addAll(object);
    }

    @Override
    public List<T> getList() {
        return dataBase;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }
}