package app.moz.ecommerce.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Seller {


    @Id
    @GeneratedValue(generator = "seller_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seller_id_seq", initialValue = 1, sequenceName = "seller_id_seq", allocationSize = 1)
    private int id;

    private String name;

    private String email;

    private Date  dateCreated;

    private int rating;


    private String image;

    @OneToMany(mappedBy = "seller")
    private List<Product> productList;

}
