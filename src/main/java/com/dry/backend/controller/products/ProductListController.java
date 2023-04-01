package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import org.springframework.web.bind.annotation.*;

import com.dry.backend.dto.products.response.ProductListResponse;
import com.dry.backend.usecases.products.ProductListUseCase;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductListController {
    private final ProductListUseCase productListUseCase;

    public ProductListController(ProductListUseCase productListUseCase) {
        this.productListUseCase = productListUseCase;
    }

    @GetMapping("/{name}")
    public ProductListResponse list(@PathVariable String name) {
        return productListUseCase.execute(name);
    }
}
