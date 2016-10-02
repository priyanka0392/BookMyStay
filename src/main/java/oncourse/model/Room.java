package oncourse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
//@Table(name = "room_details")
public class Room {

    @Id
    @GeneratedValue
  //  @Column(name = "room_id")
    private Integer id;
   // @Column(name = "room_type")
    private String type;
   // @Column(name="room_number")
    private String roomNo;
    private boolean smoke;
    @OneToMany
    private List<Facility> facility;
  //  @Column(name = "customer_capacity")
    private Integer capacity; //for how many people
  //  @Column(name = "room_rate")
    private float rate;

    @OneToMany(mappedBy = "room")
    private List<Reservation> reservation;

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    public List<Facility> getFacility() {
        return facility;
    }

    public void setFacility(List<Facility> facility) {
        this.facility = facility;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }


    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Room() {
    }
}
