package hotel.service.impl;

import hotel.model.Room;
import hotel.model.RoomItem;
import hotel.repository.RoomItemRepository;
import hotel.service.RoomItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomItemServiceImpl implements RoomItemService {

    private final RoomItemRepository roomItemRepository;

    @Override
    public List<RoomItem> getRoomItemsByRoom(Room room) {
        return roomItemRepository.findAllByRoom(room);
    }

    @Override
    public RoomItem addRoomItem(RoomItem roomItem, Room room) {
        roomItem.setRoom(room);
        return roomItemRepository.save(roomItem);
    }

    @Override
    public void deleteRoomItem(Long id) {
        roomItemRepository.deleteById(id);
    }

    @Override
    public RoomItem getRoomItem(Long id) {
        return roomItemRepository.findById(id).orElse(null);
    }

    @Override
    public RoomItem editRoomItem(RoomItem roomItem, Room room) {
        roomItem.setRoom(room);
        return roomItemRepository.save(roomItem);
    }
}
