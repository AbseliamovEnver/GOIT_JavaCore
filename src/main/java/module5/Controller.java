package main.java.module5;

public class Controller {

    API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        int countLengthAPI = 0;
        for (API apiRoom : apis) {
            countLengthAPI += apiRoom.findRooms(price, persons, city, hotel).length;
        }
        Room[] requstRooms = new Room[countLengthAPI];
        int indexRoom = 0;
        System.out.println("Rooms in hotels match your search criteria: ");
        for (API apiRoom : apis) {
            for (Room room : apiRoom.findRooms(price, persons, city, hotel)) {
                if (room != null) {
                    requstRooms[indexRoom] = room;
                    System.out.println(apiRoom.getClass().getSimpleName() + ":  " + requstRooms[indexRoom].getHotelName());
                    indexRoom++;
                }
            }
        }
        System.out.println("===============================================");
        return requstRooms;
    }

    Room[] check(API api1, API api2) {
        int indexRoom = 0;
        Room[] checkRoom = new Room[api1.getAll().length];
        System.out.println("The same rooms in hotels " + api1.getClass().getSimpleName() + " and "
                + api2.getClass().getSimpleName() + ":");
        for (int i = 0; i < api1.getAll().length; i++) {
            for (int j = 0; j < api2.getAll().length; j++) {
                if (api1.getAll()[i].equals(api2.getAll()[j])) {
                    checkRoom[indexRoom] = api1.getAll()[i];
                    System.out.println(checkRoom[indexRoom].getHotelName());
                    indexRoom++;
                }
            }
        }
        System.out.println("===============================================");
        return checkRoom;
    }

    DAO daoRoom = new DAOImpl();

    Room save(Room room) {
        daoRoom.save(room);
        return room;
    }

    boolean delete(Room room) {
        daoRoom.delete(room);
        System.out.println("===============================================");
        return false;
    }

    Room update(Room room) {
        daoRoom.update(room);
        System.out.println("===============================================");
        return room;
    }

    Room findById(long id) {
        return daoRoom.findById(id);
    }

    Room[] getAll() {
        return daoRoom.getAll();
    }
}