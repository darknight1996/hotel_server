package hotel.service;

import hotel.model.Hotel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface HotelService {

    List<Hotel> getHotels();

    Hotel getHotel(Long id);

    Hotel addHotel(Hotel hotel);

    Hotel editHotel(Hotel hotel);

    void deleteHotel(Long id);

}
