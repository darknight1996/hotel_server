package hotel.service;

import hotel.model.Room;
import hotel.model.RoomItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomItemService {

    List<RoomItem> getRoomItemsByRoom(Room room);

    RoomItem addRoomItem(RoomItem roomItem, Room room);

    void deleteRoomItem(Long id);

    RoomItem getRoomItem(Long id);

    RoomItem editRoomItem(RoomItem roomItem, Room room);


}
