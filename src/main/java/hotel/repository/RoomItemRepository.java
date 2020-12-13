package hotel.repository;

import hotel.model.Room;
import hotel.model.RoomItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomItemRepository extends JpaRepository<RoomItem, Long> {

    List<RoomItem> findAllByRoom(Room room);
}
