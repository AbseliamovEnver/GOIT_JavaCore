package Module_5;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room, long id);

    Room findById(long id);

    Room[] getAll();

}
