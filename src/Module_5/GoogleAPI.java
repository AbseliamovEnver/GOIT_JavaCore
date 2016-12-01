package Module_5;

import java.util.Date;

public class GoogleAPI extends APIImpl {
    Room[] googleRooms;

    public GoogleAPI() {
        googleRooms = new Room[5];
        googleRooms[0] = new Room(11, 8900, 2, new Date(), "Kiev", "InterContinental");
        googleRooms[1] = new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn");
        googleRooms[2] = new Room(13, 2400, 2, new Date(), "Kharkiv", "Superior Golf & SPA Resort");
        googleRooms[3] = new Room(40, 2555, 2, new Date(), "Dnepr", "Grand Hotel Ukraine");
        googleRooms[4] = new Room(50, 1700, 2, new Date(), "Odessa", "Villa le Premier");
    }

    public Room[] getAll() {
        return googleRooms;
    }
}