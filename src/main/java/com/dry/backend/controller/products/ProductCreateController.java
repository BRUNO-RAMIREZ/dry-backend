package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.usecases.products.ProductCreateUseCase;

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
    public ProductCreateResponse createProduct(@RequestBody ProductCreateRequest request) {
        return productCreateUseCase.execute(request);
    }
}
