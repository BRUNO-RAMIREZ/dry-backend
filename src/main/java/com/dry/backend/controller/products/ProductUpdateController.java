package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.usecases.products.ProductUpdateUseCase;

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
        return productUpdateUseCase.execute(productUpdateRequest);
    }
}
