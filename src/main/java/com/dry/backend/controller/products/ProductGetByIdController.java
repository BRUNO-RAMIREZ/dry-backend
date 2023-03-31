package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductGetByIdController {
    private final ProductGetByIdUseCase productGetByIdUseCase;

    constructor(ProductGetByIdUseCase productGetByIdUseCase) {
        this.productGetByIdUseCase = productGetByIdUseCase;
    }

    @GetMapping("/products/{id}")
    public ProductGetByIdResponse getProduct(@PathVariable Long id) {
        return productGetByIdUseCase.execute(id);
    }

}
