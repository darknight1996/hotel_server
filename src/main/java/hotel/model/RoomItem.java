package hotel.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="RoomItem")
public class RoomItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String name;

    private int cost;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Room room;

}
