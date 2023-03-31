package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.response.ProductListResponse;
import com.dry.backend.repository.services.ProductListService;
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

    public ProductListResponse execute() {
        return productListService.getProducts();
    }
}
