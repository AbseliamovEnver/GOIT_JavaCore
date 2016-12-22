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
        for (Room roomFindId : daoRooms) {
            if (roomFindId.getId() == room.getId()) {
                daoRooms.remove(roomFindId);
                daoRooms.add(room);
                break;
            } else if (roomFindId.getId() == 0) {
                break;
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room roomFindId : daoRooms) {
            if (roomFindId.getId() == id) {
                return roomFindId;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return daoRooms;
    }
}