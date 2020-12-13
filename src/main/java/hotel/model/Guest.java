package hotel.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Guest")
public class Guest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthDate;

}
