package com.dry.backend.dto.products.response;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/

public class ProductGetAllResponse {
    private List<ProductResponse> products;

    public ProductGetAllResponse() {
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }
}
