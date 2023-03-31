package com.dry.backend.controller.products;

import com.dry.backend.dto.products.response.ProductGetByIdResponse;
import com.dry.backend.usecases.products.ProductGetByIdUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductGetByIdController {
    private final ProductGetByIdUseCase productGetByIdUseCase;

    public ProductGetByIdController(ProductGetByIdUseCase productGetByIdUseCase) {
        this.productGetByIdUseCase = productGetByIdUseCase;
    }

    @GetMapping("/products/{id}")
    public ProductGetByIdResponse getProduct(@PathVariable Long id) {
        return productGetByIdUseCase.execute(id);
    }

}
