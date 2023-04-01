package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.usecases.products.ProductCreateUseCase;

/**
 * @author Bruno Ramirez
 **/
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductCreateController {
    private final ProductCreateUseCase productCreateUseCase;

    public ProductCreateController(ProductCreateUseCase productCreateUseCase) {
        this.productCreateUseCase = productCreateUseCase;
    }

    @PostMapping("/create")
    public ProductCreateResponse createProduct(@RequestBody ProductCreateRequest request) {
        return productCreateUseCase.execute(request);
    }
}
