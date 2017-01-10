package gojava.gojava5.module8;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    public List<T> dataBase = new LinkedList<>();

    @Override
    public T save(T element) {
        dataBase.add(element);
        return element;
    }

    @Override
    public void delete(T element) {
        dataBase.remove(element);
    }

    @Override
    public void deleteAll(List<T> list) {
        dataBase.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        dataBase.addAll(list);
    }

    @Override
    public List<T> getList() {
        return dataBase;
    }
}