package gojava.gojava5.module5;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}