package hotel.controller;

import hotel.model.Room;
import hotel.model.RoomItem;
import hotel.service.RoomItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
@RequiredArgsConstructor
public class RoomItemController {

    private final RoomItemService roomItemService;

    @GetMapping("/{roomId}/item")
    public List<RoomItem> getRoomItemsByRoom(@PathVariable Long roomId) {
        Room room = new Room();
        room.setId(roomId);
        return roomItemService.getRoomItemsByRoom(room);
    }

    @GetMapping("/item/{id}")
    public RoomItem getRoomItem(@PathVariable Long id) {
        return roomItemService.getRoomItem(id);
    }

    @PostMapping("/{roomId}/item")
    public RoomItem addRoomItem(@RequestBody RoomItem roomItem, @PathVariable Long roomId) {
        Room room = new Room();
        room.setId(roomId);
        return roomItemService.addRoomItem(roomItem, room);
    }

    @PutMapping("/{roomId}/item")
    public RoomItem editRoomItem(@RequestBody RoomItem roomItem, @PathVariable Long roomId) {
        Room room = new Room();
        room.setId(roomId);
        return roomItemService.editRoomItem(roomItem, room);
    }

    @DeleteMapping("/item/{id}")
    public void deleteRoom(@PathVariable Long id) {
        roomItemService.deleteRoomItem(id);
    }
}
