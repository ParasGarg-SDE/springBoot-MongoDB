package in.parasgargsrm.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "customer")

@Entity
@Table(name = "customer",
        indexes = {
                @Index(name = "index_name", columnList = "name", unique = true),
                @Index(name = "index_mobileNo", columnList = "mobileNo", unique = true)
        })
@Getter
@Setter
public class Customer {

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    private long age;

    @Column(name = "mobile_no", nullable = false)
    private String mobileNo;

    private String occupation;

    private String dOB;

    private Address address;
}