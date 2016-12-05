package main.java.module5;

import java.util.Arrays;

public class DAOImpl implements DAO {

    private Room[] daoRooms = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i] == null) {
                daoRooms[i] = room;
                System.out.println("Room " + room.getId() + " in the \"" + daoRooms[i].getHotelName() + "\" saved");
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
                System.out.println("Room " + room.getId() + " in the \"" + room.getHotelName() + "\" deleted");
                delete = true;
                break;
            } else if (i == daoRooms.length - 1) {
                System.out.println("The \"" + daoRooms[i].getHotelName() + "\" has no such room " + room.getId());
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
                System.out.println("Room id " + room.getId() + " is updated");
                break;
            } else if (i == daoRooms.length - 1) {
                System.out.println("The \"" + daoRooms[i].getHotelName() + "\" has no such room " + room.getId());
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
                System.out.println("Room with number id " + id + " found in " + daoRooms[i].getHotelName());
                idDaoRoom = i;
                break;
            } else if (i == daoRooms.length - 1) {
                System.out.println("Room with id number " + id + " is not found");
                break;
            }
        }
        return daoRooms[idDaoRoom];
    }

    @Override
    public Room[] getAll() {
        for (int i = 0; i < daoRooms.length; i++) {
            if (daoRooms[i] != null) {
                System.out.println(daoRooms[i].getHotelName());
            }
        }
        return daoRooms;
    }
}
