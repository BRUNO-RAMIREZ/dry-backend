package com.dry.backend.dto.sales.request;

import com.dry.backend.dto.clients.request.ClientCreateRequest;
import com.dry.backend.dto.products.request.ProductCreateRequest;

import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public class SaleUpdateByIdRequest {

    private String code;

    private Date saleDate;

    private Double total;

    private Boolean state;

    private List<Integer> quantityStockOfProductsSaled;
    private ClientCreateRequest client;
    private List<ProductCreateRequest> products;

    public SaleUpdateByIdRequest() {
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

    public ClientCreateRequest getClient() {
        return client;
    }

    public void setClient(ClientCreateRequest client) {
        this.client = client;
    }

    public List<ProductCreateRequest> getProducts() {
        return products;
    }

    public void setProducts(List<ProductCreateRequest> products) {
        this.products = products;
    }

    public List<Integer> getQuantityStockOfProductsSaled() {
        return quantityStockOfProductsSaled;
    }

    public void setQuantityStockOfProductsSaled(List<Integer> quantityStockOfProductsSaled) {
        this.quantityStockOfProductsSaled = quantityStockOfProductsSaled;
    }
}
