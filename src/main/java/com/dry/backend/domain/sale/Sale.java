package com.dry.backend.domain.sale;

import com.dry.backend.domain.client.Client;
import com.dry.backend.domain.products.Product;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Entity
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long id;

    @Column(name = "code", nullable = true)
    private String code;

    @Temporal(TemporalType.DATE)
    @Column(name = "sale_date", nullable = true)
    private Date saleDate;

    @Column(name = "total", nullable = true)
    private Double total;

    @Column(name = "state", nullable = true)
    private Boolean state;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(name = "sale_product",
            joinColumns = @JoinColumn(name = "sale_id", referencedColumnName = "sale_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"))
    private List<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
