package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private List<Room> daoRooms = new ArrayList<>();

    @Override
    public Room save(Room room) {
        daoRooms.add(room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        if (daoRooms.contains(room)) {
            daoRooms.remove(room);
            return true;
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        Room found = findById(room.getId());
        if (found != null) {
            daoRooms.remove(found);
            daoRooms.add(room);
        } else {
            System.out.println("Room not found");
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room room : daoRooms) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return daoRooms;
    }
}