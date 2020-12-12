package hotel.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="RoomOrder")
public class RoomOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private Date startDate;

    private Date endDate;

    private String guestName;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

    @ManyToOne
    @JoinColumn(name="guest_id", nullable=false)
    private Guest guest;

}
