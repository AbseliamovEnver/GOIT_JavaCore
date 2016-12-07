package gojava.gojava5.module5;

public class Controller {

    DAO daoRoom = new DAOImpl();
    API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        int countLengthAPI = 0;
        for (API apiRoom : apis) {
            countLengthAPI += apiRoom.findRooms(price, persons, city, hotel).length;
        }
        Room[] requstRooms = new Room[countLengthAPI];
        int indexRoom = 0;
        for (API apiRoom : apis) {
            for (Room room : apiRoom.findRooms(price, persons, city, hotel)) {
                if (room != null) {
                    requstRooms[indexRoom] = room;
                    indexRoom++;
                }
            }
        }
        return requstRooms;
    }

    Room[] check(API api1, API api2) {
        int indexRoom = 0;
        Room[] checkRoom = new Room[api1.getAll().length];
        for (int i = 0; i < api1.getAll().length; i++) {
            for (int j = 0; j < api2.getAll().length; j++) {
                if (api1.getAll()[i].equals(api2.getAll()[j])) {
                    checkRoom[indexRoom] = api1.getAll()[i];
                    indexRoom++;
                }
            }
        }
        return checkRoom;
    }
}