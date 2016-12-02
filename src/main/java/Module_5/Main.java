package Module_5;

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

        Room room_1 = new Room(21, 8500, 2, new Date(), "Kiev", "Hyatt Regency");
        Room room_2 = new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn");
        Room room_3 = new Room(30, 1550, 2, new Date(), "Kharkiv", "Misto Hotel");

        controller.save(room_1);
        controller.save(room_2);
        controller.save(room_3);
        controller.delete(room_2);
        controller.update(room_1, 100);
        controller.findById(100L);
        controller.update(room_1, 200);
        controller.findById(100L);
        controller.getAll();
    }
}
