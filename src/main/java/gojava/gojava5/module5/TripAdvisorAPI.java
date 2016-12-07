package gojava.gojava5.module5;

import java.util.Date;

public class TripAdvisorAPI extends APIImpl {
    Room[] tripAdvisorRooms;

    public TripAdvisorAPI() {
        tripAdvisorRooms = new Room[5];
        tripAdvisorRooms[0] = new Room(21, 8500, 2, new Date(), "Kiev", "Hyatt Regency");
        tripAdvisorRooms[1] = new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn");
        tripAdvisorRooms[2] = new Room(13, 2400, 2, new Date(), "Kharkiv", "Superior Golf & SPA Resort");
        tripAdvisorRooms[3] = new Room(40, 2555, 2, new Date(), "Dnepr", "Grand Hotel Ukraine");
        tripAdvisorRooms[4] = new Room(15, 1800, 2, new Date(), "Odessa", "California Boutique Hotel");
    }

    public Room[] getAll() {
        return tripAdvisorRooms;
    }
}
