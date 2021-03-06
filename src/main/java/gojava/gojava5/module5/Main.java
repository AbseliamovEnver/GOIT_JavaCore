package gojava.gojava5.module5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        API bookingComAPI = new BookingComAPI();
        API googleAPI = new GoogleAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();

        Controller controller = new Controller();
        controller.requstRooms(2555, 2, "Dnepr", "Grand Hotel Ukraine");
        controller.requstRooms(1700, 2, "Odessa", "Villa le Premier");
        controller.requstRooms(8900, 2, "Kiev", "InterContinental");

        controller.check(bookingComAPI, googleAPI);
        controller.check(bookingComAPI, tripAdvisorAPI);
        controller.check(googleAPI, tripAdvisorAPI);

        Room room1 = new Room(21, 8500, 2, new Date(), "Kiev", "Hyatt Regency");
        Room room2 = new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn");
        Room room3 = new Room(30, 1550, 2, new Date(), "Kharkiv", "Misto Hotel");
        Room room4 = new Room(21, 1700, 2, new Date(), "Odessa", "Villa le Premier");

        controller.daoRoom.save(room1);
        controller.daoRoom.save(room2);
        controller.daoRoom.save(room3);
        controller.daoRoom.save(room4);
        controller.daoRoom.delete(room2);
        controller.daoRoom.findById(21L);
        controller.daoRoom.getAll();
        controller.daoRoom.update(room4);
        controller.daoRoom.findById(21L);
        controller.daoRoom.findById(31L);
        controller.daoRoom.getAll();
    }
}
