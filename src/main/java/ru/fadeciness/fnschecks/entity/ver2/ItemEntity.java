package ru.fadeciness.fnschecks.entity.ver2;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class ItemEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sum")
    private Long sum;

    @Column(name = "productType")
    private Long productType;


}
