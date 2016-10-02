package oncourse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name = "room_facility")
public class Facility {

    @Id
    @GeneratedValue
    private Integer id;
    private boolean microwave;
    private boolean flatTV;
    private boolean miniFridge;
    private boolean balcony;
}
