package com.dry.backend.domain.products;


import com.dry.backend.domain.sale.Sale;

import javax.persistence.*;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", length = 10000000)
    private String description;

    @Lob
    @Column(name = "image", length = 10000000)
    private String image;

    @Column(name = "purchase_price", nullable = false)
    private Double purchasePrice;

    @Column(name = "sale_price", nullable = false)
    private Double salePrice;

    @Column(name = "stock")
    private Double stock;

    @ManyToMany(mappedBy = "products")
    private List<Sale> sales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}
