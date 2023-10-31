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

public class Product {


    @Id
    @GeneratedValue(generator = "product_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "product_id_seq", initialValue = 1, sequenceName = "product_id_seq", allocationSize = 1)
    private int id;

    private String productName;

    private String productDetails;

    private int stock;

    private String productImage;

    private int price;

    private int productRating;

    @ManyToOne
    private Seller seller;

    @OneToMany
    private List<ProductComments> productCommentsList;

    @ManyToMany
    private List<Category> categories;




}
