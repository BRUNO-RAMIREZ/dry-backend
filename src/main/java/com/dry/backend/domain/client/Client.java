package com.dry.backend.domain.client;

import com.dry.backend.domain.sale.Sale;

import javax.persistence.*;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;

    @Column(name = "ci", nullable = false)
    private String ci;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "client")
    private List<Sale> sales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
