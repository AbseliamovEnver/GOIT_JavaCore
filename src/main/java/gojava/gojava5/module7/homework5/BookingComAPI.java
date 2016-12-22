package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI extends APIImpl {
    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(10, 7300, 2, new Date(), "Kiev", "Premier Palace Hotel"));
        rooms.add(new Room(20, 3750, 2, new Date(), "Lviv", "Nobilis Hotel"));
        rooms.add(new Room(30, 1550, 2, new Date(), "Kharkiv", "Misto Hotel"));
        rooms.add(new Room(40, 2555, 2, new Date(), "Dnepr", "Grand Hotel Ukraine"));
        rooms.add(new Room(50, 1700, 2, new Date(), "Odessa", "Villa le Premier"));
    }

    public List<Room> getAll() {
        return rooms;
    }
}