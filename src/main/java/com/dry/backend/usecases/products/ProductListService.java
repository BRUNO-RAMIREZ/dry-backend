package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductListService {
    private ProductListService productListService;

    public ProductListService(ProductListService productListService) {
        this.productListService = productListService;
    }

    public ProductListResponse execute() {
        return productListService.getProducts();
    }
}
