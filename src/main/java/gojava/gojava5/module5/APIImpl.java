package gojava.gojava5.module5;

public abstract class APIImpl implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int indexRoom = 0;
        int countFindRoom = 0;
        int indexFindRoom = 0;
        Room[] findRooms = new Room[getAll().length];
        for (Room room : getAll()) {
            if (room.getPrice() == price && room.getPersons() == persons) {
                if (room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    findRooms[indexRoom] = room;
                    indexRoom++;
                    countFindRoom = indexRoom;
                }
            }
        }
        Room[] findRoomsResult = new Room[countFindRoom];
        for (int i = 0; i < findRooms.length; i++) {
            if (findRooms[i] != null) {
                findRoomsResult[indexFindRoom] = findRooms[i];
                indexFindRoom++;
            }
        }
        return findRoomsResult;
    }
}