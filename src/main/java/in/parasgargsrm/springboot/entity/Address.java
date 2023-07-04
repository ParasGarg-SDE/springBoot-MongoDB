package in.parasgargsrm.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Id;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
public class Address {

    @Id
    private long id;

    private String houseNo;

    private String floor;

    private String street;

    private String city;

    private String state;

    private int pinCode;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return id == address.id && pinCode == address.pinCode && Objects.equals(houseNo, address.houseNo) && Objects.equals(floor, address.floor) && Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(createdAt, address.createdAt) && Objects.equals(updatedAt, address.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, houseNo, floor, street, city, state, pinCode, createdAt, updatedAt);
    }
}
