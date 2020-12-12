package hotel.controller;

import hotel.model.Hotel;
import hotel.model.Room;
import hotel.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/{hotelId}/room")
    public List<Room> getRoomsByHotel(@PathVariable Long hotelId) {
        Hotel hotel = new Hotel();
        hotel.setId(hotelId);
        return roomService.getRoomsByHotel(hotel);
    }

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable Long id) {
        return roomService.getRoom(id);
    }

    @PostMapping("/{hotelId}/room")
    public Room addRoom(@RequestBody Room room, @PathVariable Long hotelId) {
        Hotel hotel = new Hotel();
        hotel.setId(hotelId);
        return roomService.addRoom(room, hotel);
    }

    @PutMapping("/{hotelId}/room")
    public Room editRoom(@RequestBody Room room, @PathVariable Long hotelId) {
        Hotel hotel = new Hotel();
        hotel.setId(hotelId);
        return roomService.editRoom(room, hotel);
    }

    @DeleteMapping("/room/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}
