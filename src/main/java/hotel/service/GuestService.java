package hotel.service;

import hotel.model.Guest;

import java.util.List;

public interface GuestService {

    List<Guest> getGuests();

    Guest getGuest(Long id);

    Guest addGuest(Guest guest);

    Guest editGuest(Guest guest);

    void deleteGuest(Long id);
}
