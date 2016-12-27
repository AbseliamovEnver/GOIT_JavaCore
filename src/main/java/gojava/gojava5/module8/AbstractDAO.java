package gojava.gojava5.module8;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T object);

    void delete(T object);

    void deleteAll(List<T> object);

    void saveAll(List<T> object);

    List<T> getList();

    void deleteById(long id);

    T get(long id);
}