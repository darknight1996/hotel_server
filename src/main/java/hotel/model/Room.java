package hotel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="Room")
public class Room {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private int number;

    @ManyToOne
    @JoinColumn(name="hotel_id", nullable=false)
    private Hotel hotel;

    @JsonIgnore
    @OneToMany(mappedBy="room")
    private Set<RoomItem> roomItems;

    @JsonIgnore
    @OneToMany(mappedBy="room")
    private Set<RoomOrder> roomOrders;


}
