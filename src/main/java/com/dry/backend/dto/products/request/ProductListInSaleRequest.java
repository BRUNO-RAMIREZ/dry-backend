package com.dry.backend.dto.products.request;

/**
 * @author Bruno Ramirez
 **/

public class ProductListInSaleRequest {

    private Long id;

    private Integer stock;

    public ProductListInSaleRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
