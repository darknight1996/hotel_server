package hotel.controller;

import hotel.model.Guest;
import hotel.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guest")
@RequiredArgsConstructor
public class GuestController {

    private final GuestService guestService;

    @GetMapping
    public List<Guest> getGuests() {
        return guestService.getGuests();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable Long id) {
        return guestService.getGuest(id);
    }

    @PostMapping
    public Guest addHotel(@RequestBody Guest hotel) {
        return guestService.addGuest(hotel);
    }

    @PutMapping
    public Guest editHotel(@RequestBody Guest hotel) {
        return guestService.editGuest(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        guestService.deleteGuest(id);
    }

}
