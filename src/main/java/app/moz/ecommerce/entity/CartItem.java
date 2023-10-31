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
public class CartItem {


    @Id
    @GeneratedValue(generator = "cartitem_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cartitem_id_seq", initialValue = 1, sequenceName = "cartitem_id_seq", allocationSize = 1)
    private int id;

    @ManyToOne
    private Product product;

    private int quantity;


    @ManyToOne
    private Cart cart;

}
