package hotel.model;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

    @ManyToOne
    @JoinColumn(name="guest_id", nullable=false)
    private Guest guest;

}
