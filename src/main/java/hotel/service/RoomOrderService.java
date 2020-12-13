package hotel.service;

import hotel.model.Room;
import hotel.model.RoomItem;
import hotel.model.RoomOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomOrderService {

    List<RoomOrder> getRoomOrdersByRoom(Room room);

    void deleteRoomOrder(Long id);

    RoomOrder addRoomOrder(RoomOrder roomOrder);
}
