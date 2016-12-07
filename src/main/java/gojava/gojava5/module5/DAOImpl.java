package gojava.gojava5.module5;

import java.util.Arrays;

public class DAOImpl implements DAO {

    private Room[] daoRooms = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i] == null) {
                daoRooms[i] = room;
                break;
            } else if (i == daoRooms.length - 1) {
                daoRooms = Arrays.copyOf(daoRooms, daoRooms.length * 2);
                daoRooms[++i] = room;
                break;
            }
        }
        return room;
    }

    @Override
    public boolean delete(Room room) {
        boolean delete = false;
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i].equals(room)) {
                daoRooms[i] = null;
                delete = true;
                break;
            } else if (i == daoRooms.length - 1) {
                break;
            }
        }
        return delete;
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i].getId() == room.getId()) {
                daoRooms[i] = room;
                break;
            } else if (i == daoRooms.length - 1) {
                break;
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        int idDaoRoom = 0;
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i] != null && daoRooms[i].getId() == id) {
                idDaoRoom = i;
                break;
            } else if (i == daoRooms.length - 1) {
                break;
            }
        }
        return daoRooms[idDaoRoom];
    }

    @Override
    public Room[] getAll() {
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i] != null) {
                System.out.println("");
            }
        }
        return daoRooms;
    }
}
