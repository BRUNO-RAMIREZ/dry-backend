package com.dry.backend.domain.products;

import javax.persistence.*;

/**
 * @author Bruno Ramirez
 **/
@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
}
