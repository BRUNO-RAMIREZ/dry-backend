package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.response.ProductListResponse;
import com.dry.backend.services.products.ProductListService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductListUseCase {
    private ProductListService productListService;

    public ProductListUseCase(ProductListService productListService) {
        this.productListService = productListService;
    }

    public ProductListResponse execute(String name) {
        if (name == null || name.isEmpty()) {
           // return productListService.getAllProducts(name);
        }
        return null;
    }
}
