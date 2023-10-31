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

public class ProductComments {


    @Id
    @GeneratedValue(generator = "productcomments_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "productcomments_id_seq", initialValue = 1, sequenceName = "productcomments_id_seq", allocationSize = 1)
    private int id;

    private String body;

    private Date createdAt;

    private int rating;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

}
