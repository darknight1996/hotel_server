package hotel.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RoomOrderDTO {

    private long id;

    private Date startDate;

    private Date endDate;

    private long guestId;

}
