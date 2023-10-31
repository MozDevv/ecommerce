package app.moz.ecommerce.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Address {


    @Id
    @GeneratedValue(generator = "address_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "address_id_seq", initialValue = 1, sequenceName = "address_id_seq", allocationSize = 1)
    private int id;

    private String country;



    private String city;

    private String phoneNumber;

    private String town;

    private String address;

    @ManyToOne
    private User user;

}
