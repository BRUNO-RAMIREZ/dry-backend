package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductCreateController {
    private final ProductCreateUseCase productCreateUseCase;

    public ProductCreateController(ProductCreateUseCase productCreateUseCase) {
        this.productCreateUseCase = productCreateUseCase;
    }

    @PostMapping("/products/create")
    public ProductCreateResponse createProduct(ProductCreateRequest request) {
        productCreateUseCase.execute(request);
    }
}
