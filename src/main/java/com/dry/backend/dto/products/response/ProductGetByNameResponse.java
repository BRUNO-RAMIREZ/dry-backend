package com.dry.backend.dto.products.response;



import java.util.List;

/**
 * @author Bruno Ramirez
 **/

public class ProductGetByNameResponse {
    private List<ProductResponse> products;

    public ProductGetByNameResponse() {
    }

    public List<ProductResponse> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }
}
