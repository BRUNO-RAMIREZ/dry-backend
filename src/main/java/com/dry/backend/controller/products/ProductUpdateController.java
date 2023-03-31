package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@RestController
public class ProductUpdateController {
    private final ProductUpdateUseCase productUpdateUseCase;

    public ProductUpdateController(ProductUpdateUseCase productUpdateUseCase) {
        this.productUpdateUseCase = productUpdateUseCase;
    }

    @PutMapping("/products/{id}")
    public ProductUpdateResponse updateProduct(@PathVariable ProductUpdateRequest productUpdateRequest) {
        productUpdateUseCase.execute(productUpdateRequest);
    }
}
