package hotel.service.impl;

import hotel.model.Hotel;
import hotel.model.Room;
import hotel.repository.RoomRepository;
import hotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public List<Room> getRoomsByHotel(Hotel hotel) {
        return roomRepository.findAllByHotel(hotel);
    }

    @Override
    public Room addRoom(Room room, Hotel hotel) {
        room.setHotel(hotel);
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }

    @Override
    public Room getRoom(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public Room editRoom(Room room, Hotel hotel) {
        room.setHotel(hotel);
        return roomRepository.save(room);
    }

}
