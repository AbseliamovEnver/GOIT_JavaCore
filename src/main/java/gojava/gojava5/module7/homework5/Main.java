package gojava.gojava5.module7.homework5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.requstRooms(2555, 2, "Dnepr", "Grand Hotel Ukraine");
        controller.requstRooms(1700, 2, "Odessa", "Villa le Premier");
        controller.requstRooms(8900, 2, "Kiev", "InterContinental");

        controller.check(controller.getApis().get(0), controller.getApis().get(1));
        controller.check(controller.getApis().get(0), controller.getApis().get(2));
        controller.check(controller.getApis().get(1), controller.getApis().get(2));

        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room(21, 8500, 2, new Date(), "Kiev", "Hyatt Regency"));
        roomList.add(new Room(12, 2900, 2, new Date(), "Lviv", "Citadel Inn"));
        roomList.add(new Room(30, 1550, 2, new Date(), "Kharkiv", "Misto Hotel"));
        roomList.add(new Room(21, 1700, 2, new Date(), "Odessa", "Villa le Premier"));

        controller.getDao().save(roomList.get(0));
        controller.getDao().save(roomList.get(1));
        controller.getDao().save(roomList.get(2));
        controller.getDao().save(roomList.get(2));

        System.out.println(roomList.toString());

        roomList.remove(3);

        System.out.println(roomList.toString());
    }
}
