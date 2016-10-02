package oncourse.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Table(name = "customer_reservation")
public class Reservation {

    @Id
    @GeneratedValue
    private Integer id;
  //  @Column(name = "checkin_date")
    private Date checkin;
   // @Column(name = "checkout_date")
    private Date checkout;
   // @Column(name = "adult_num")
    private Integer adultnum;
   // @Column(name = "child_num")
    private Integer childnum;
   // @Column(name = "reservation_status")
    private boolean status; //0: cancelled 1: valid

    public void setUser(List<UserDetails> user) {
        this.user = user;
    }

    @OneToMany
    private List<UserDetails> user;
    @ManyToOne
    private Room room;

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    @OneToMany(mappedBy = "reservation")
    private List<Payment> payment ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Integer getAdultnum() {
        return adultnum;
    }

    public void setAdultnum(Integer adultnum) {
        this.adultnum = adultnum;
    }

    public Integer getChildnum() {
        return childnum;
    }

    public void setChildnum(Integer childnum) {
        this.childnum = childnum;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }




    public Reservation() {
    }
}
