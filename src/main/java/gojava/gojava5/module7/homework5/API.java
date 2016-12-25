package gojava.gojava5.module7.homework5;

import java.util.List;

public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();
}