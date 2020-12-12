package hotel.service.impl;

import hotel.model.Guest;
import hotel.repository.GuestRepository;
import hotel.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    @Override
    public List<Guest> getGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest getGuest(Long id) {
        return guestRepository.findById(id).orElse(null);
    }

    @Override
    public Guest addGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public Guest editGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }
}
