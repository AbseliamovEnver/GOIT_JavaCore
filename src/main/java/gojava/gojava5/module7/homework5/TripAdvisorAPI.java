package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI extends APIImpl {
    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(21, 8500, 2, new Date(), "Kiev", "Hyatt Regency"));
        rooms.add(new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn"));
        rooms.add(new Room(13, 2400, 2, new Date(), "Kharkiv", "Superior Golf & SPA Resort"));
        rooms.add(new Room(40, 2555, 2, new Date(), "Dnepr", "Grand Hotel Ukraine"));
        rooms.add(new Room(15, 1800, 2, new Date(), "Odessa", "California Boutique Hotel"));
    }

    public List<Room> getAll() {
        return rooms;
    }
}
