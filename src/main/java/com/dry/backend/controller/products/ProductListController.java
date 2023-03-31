package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dry.backend.dto.products.response.ProductListResponse;
import com.dry.backend.usecases.products.ProductListUseCase;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductListController {
    private final ProductListUseCase productListUseCase;

    public ProductListController(ProductListUseCase productListUseCase) {
        this.productListUseCase = productListUseCase;
    }

    @GetMapping("/products")
    public ProductListResponse list() {
        return productListUseCase.execute();
    }
}
