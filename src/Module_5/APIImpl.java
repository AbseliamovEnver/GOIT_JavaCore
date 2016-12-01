package Module_5;

public abstract class APIImpl implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int indexRoom = 0;
        int indexFindRoom = 0;
        Room[] findRooms = new Room[getAll().length];
        for (Room room : getAll()) {
            if (room.getPrice() == price && room.getPersons() == persons &&
                    room.getCityName() == city && room.getHotelName() == hotel) {
                findRooms[indexRoom] = room;
                indexRoom++;
            }
        }
        for (int i = 0; i < findRooms.length; i++) {
            if (findRooms[i] != null) {
                findRooms[indexFindRoom] = findRooms[i];
                indexFindRoom++;
            }
        }
        return findRooms;
    }
}