package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.List;

public abstract class APIImpl implements API {
    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> listFindRooms = new ArrayList<>();
        for (Room room : getAll()) {
            if (room.getPrice() == price && room.getPersons() == persons) {
                if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    listFindRooms.add(room);
                }
            }
        }
        return listFindRooms;
    }
}