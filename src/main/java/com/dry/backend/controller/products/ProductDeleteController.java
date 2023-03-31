package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dry.backend.usecases.products.ProductDeleteUseCase;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductDeleteController {
    private final ProductDeleteUseCase productDeleteUseCase;

    public ProductDeleteController(ProductDeleteUseCase productDeleteUseCase) {
        this.productDeleteUseCase = productDeleteUseCase;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productDeleteUseCase.execute(id);
    }
}
