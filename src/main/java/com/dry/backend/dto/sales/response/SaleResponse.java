package com.dry.backend.dto.sales.response;

import com.dry.backend.domain.client.Client;
import com.dry.backend.domain.products.Product;
import com.dry.backend.dto.clients.response.ClientCreateResponse;
import com.dry.backend.dto.products.response.ProductResponse;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public class SaleResponse {

    private Long id;

    private String code;

    private Date saleDate;

    private Double total;

    private Boolean state;

    private ClientCreateResponse client;

    private List<ProductResponse> products;

    public SaleResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClient(ClientCreateResponse client) {
        this.client = client;
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

    public ClientCreateResponse getClient() {
        return client;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }


    public void setProductsResponse(List<ProductResponse> products) {
        this.products = products;
    }
}
