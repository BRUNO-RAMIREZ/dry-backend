package com.dry.backend.dto.sales.response;

import com.dry.backend.dto.clients.response.ClientUpdateByIdResponse;
import com.dry.backend.dto.products.response.ProductResponse;

import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public class SaleUpdateByIdResponse {
    private Long id;
    private String code;

    private Date saleDate;

    private Double total;
    private Boolean state;

    private List<Integer> quantityStockOfProductsSaled;
    private ClientUpdateByIdResponse client;

    private List<ProductResponse> products;

    public SaleUpdateByIdResponse() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientUpdateByIdResponse getClient() {
        return client;
    }

    public void setClient(ClientUpdateByIdResponse client) {
        this.client = client;
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }

    public List<Integer> getQuantityStockOfProductsSaled() {
        return quantityStockOfProductsSaled;
    }

    public void setQuantityStockOfProductsSaled(List<Integer> quantityStockOfProductsSaled) {
        this.quantityStockOfProductsSaled = quantityStockOfProductsSaled;
    }
}
