package hotel.service;

import hotel.model.Hotel;
import hotel.model.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {

    List<Room> getRoomsByHotel(Hotel hotel);

    Room addRoom(Room room, Hotel hotel);

    void deleteRoom(Long id);

    Room getRoom(Long id);

    Room editRoom(Room room, Hotel hotel);

}
