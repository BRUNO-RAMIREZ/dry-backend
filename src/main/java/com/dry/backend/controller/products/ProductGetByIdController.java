package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import org.springframework.web.bind.annotation.*;

import com.dry.backend.dto.products.response.ProductGetByIdResponse;
import com.dry.backend.usecases.products.ProductGetByIdUseCase;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)

public class ProductGetByIdController {
    private final ProductGetByIdUseCase productGetByIdUseCase;

    public ProductGetByIdController(ProductGetByIdUseCase productGetByIdUseCase) {
        this.productGetByIdUseCase = productGetByIdUseCase;
    }

    @GetMapping("/{id}/findById")
    public ProductGetByIdResponse getProduct(@PathVariable Long id) {
        return productGetByIdUseCase.execute(id);
    }

}
