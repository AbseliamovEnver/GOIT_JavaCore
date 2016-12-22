package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private DAOImpl daoRoom = new DAOImpl();
    private List<API> apis = new ArrayList<>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public List<Room> requstRooms(int price, int persons, String city, String hotel) {
        List<Room> listOfRoomsRequested = new ArrayList();
        for (API api : apis) {
            listOfRoomsRequested.addAll(api.findRooms(price, persons, city, hotel));
        }
        return listOfRoomsRequested;
    }

    public List<Room> check(API api1, API api2) {
        List<Room> listOfEqualRooms = new ArrayList();
        for (Room roomApi1 : api1.getAll()) {
            for (Room roomApi2 : api2.getAll()) {
                if (roomApi1.equals(roomApi2)) {
                    listOfEqualRooms.add(roomApi1);
                }
            }
        }
        return listOfEqualRooms;
    }

    public List<API> getApis() {
        return apis;
    }

    public DAOImpl getDao() {
        return daoRoom;
    }
}