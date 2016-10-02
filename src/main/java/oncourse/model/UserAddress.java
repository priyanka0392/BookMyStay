package oncourse.model;

import javax.persistence.Embeddable;

@Embeddable
public class UserAddress {

    private String addr1;
    private String addr2;
    private String city;
    private String State;
    private String zipcode;
    private String phone;
}
