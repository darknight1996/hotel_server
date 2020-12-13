package hotel.repository;

import hotel.model.Room;
import hotel.model.RoomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomOrderRepository extends JpaRepository<RoomOrder, Long> {

    List<RoomOrder> findAllByRoom(Room room);

    @Query(value="SELECT hotel.name, room.number, room_order.start_date, room_order.end_date, guest.first_name, guest.last_name  FROM room_order, room, guest, hotel\n" +
            "WHERE room_order.room_id = room.id AND\n" +
            "\troom_order.guest_id = guest.id AND\n" +
            "    room.hotel_id = hotel.id", nativeQuery = true)
    List<Object[]> getAll();

}
