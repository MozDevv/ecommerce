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
public class Cart {


    @Id
    @GeneratedValue(generator = "cart_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cart_id_seq", initialValue = 1, sequenceName = "cart_id_seq", allocationSize = 1)
    private int id;


    @OneToMany
    private List<CartItem> cartItems;

}
