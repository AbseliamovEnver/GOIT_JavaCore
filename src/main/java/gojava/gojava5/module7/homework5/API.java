package gojava.gojava5.module7.homework5;

import java.util.List;

public interface API {
    List<gojava.gojava5.module7.homework5.Room> findRooms(int price, int persons, String city, String hotel);

    List<gojava.gojava5.module7.homework5.Room> getAll();
}