package hotel.service.impl;

import hotel.model.Room;
import hotel.model.RoomOrder;
import hotel.repository.RoomOrderRepository;
import hotel.service.RoomOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomOrderServiceImpl implements RoomOrderService {

    private final RoomOrderRepository roomOrderRepository;

    @Override
    public List<RoomOrder> getRoomOrdersByRoom(Room room) {
        return roomOrderRepository.findAllByRoom(room);
    }

    @Override
    public void deleteRoomOrder(Long id) {
        roomOrderRepository.deleteById(id);
    }

    @Override
    public RoomOrder addRoomOrder(RoomOrder roomOrder) {
        return roomOrderRepository.save(roomOrder);
    }
}
