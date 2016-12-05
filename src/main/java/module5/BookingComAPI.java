package main.java.module5;

import java.util.Date;

public class BookingComAPI extends APIImpl {
    Room[] bookingRooms;

    public BookingComAPI() {
        bookingRooms = new Room[5];
        bookingRooms[0] = new Room(10, 7300, 2, new Date(), "Kiev", "Premier Palace Hotel");
        bookingRooms[1] = new Room(20, 3750, 2, new Date(), "Lviv", "Nobilis Hotel");
        bookingRooms[2] = new Room(30, 1550, 2, new Date(), "Kharkiv", "Misto Hotel");
        bookingRooms[3] = new Room(40, 2555, 2, new Date(), "Dnepr", "Grand Hotel Ukraine");
        bookingRooms[4] = new Room(50, 1700, 2, new Date(), "Odessa", "Villa le Premier");
    }

    public Room[] getAll() {
        return bookingRooms;
    }
}