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
public class Category {


    @Id
    @GeneratedValue(generator = "category_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "category_id_seq", initialValue = 1, sequenceName = "category_id_seq", allocationSize = 1)
    private int id;

    private String categoryName;

    private String categoryDescription;


    @ManyToMany(mappedBy = "categories")
    private List<Product> productList;


    //private List<Product> productList;

}
