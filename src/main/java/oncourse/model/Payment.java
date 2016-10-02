package oncourse.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
//@Table(name="payment_details")
public class Payment implements Serializable {

    @Id
    @GeneratedValue
  //          @Column(name = "payment_id")
    private int paymentId;
   // @Column(name = "payment_amount")
    private float paymentAmount;

    public List<SecurityCard> getCard() {
        return card;
    }

    public void setCard(List<SecurityCard> card) {
        this.card = card;
    }

    @OneToMany
    private List<SecurityCard> card;
    @ManyToOne
    private Reservation reservation;



}
