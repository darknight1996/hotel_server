package hotel.controller;

import hotel.dto.RoomOrderDTO;
import hotel.model.Guest;
import hotel.model.Room;
import hotel.model.RoomItem;
import hotel.model.RoomOrder;
import hotel.repository.RoomOrderRepository;
import hotel.service.RoomOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/room")
@RequiredArgsConstructor
public class RoomOrderController {

    private final RoomOrderService roomOrderService;

    private final RoomOrderRepository roomOrderRepository;

    @GetMapping("/{roomId}/order")
    public List<RoomOrder> getRoomOrdersByRoom(@PathVariable Long roomId) {
        Room room = new Room();
        room.setId(roomId);
        return roomOrderService.getRoomOrdersByRoom(room);
    }

    @GetMapping("/order/all")
    public List<Object[]> getRoomOrders() {
        List<Object[]> orders = roomOrderRepository.getAll();
        orders.forEach(order -> {
            Date startDate = new Date(((Timestamp) order[2]).getTime());
            Date endDate = new Date(((Timestamp) order[3]).getTime());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            order[2] = dateFormat.format(startDate);
            order[3] = dateFormat.format(endDate);
        });
        return orders;
    }


    @PostMapping("/{roomId}/order")
    public RoomOrder addRoomItem(@RequestBody RoomOrderDTO roomOrderDTO, @PathVariable Long roomId) {
        Room room = new Room();
        room.setId(roomId);
        Guest guest = new Guest();
        guest.setId(roomOrderDTO.getGuestId());
        RoomOrder roomOrder = new RoomOrder();
        roomOrder.setStartDate(roomOrderDTO.getStartDate());
        roomOrder.setEndDate(roomOrderDTO.getEndDate());
        roomOrder.setRoom(room);
        roomOrder.setGuest(guest);
        return roomOrderService.addRoomOrder(roomOrder);
    }

    @DeleteMapping("/order/{id}")
    public void deleteOrder(@PathVariable Long id) {
        this.roomOrderService.deleteRoomOrder(id);
    }

}
