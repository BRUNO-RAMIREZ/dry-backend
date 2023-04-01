package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import org.springframework.web.bind.annotation.*;

import com.dry.backend.usecases.products.ProductDeleteUseCase;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductDeleteController {
    private final ProductDeleteUseCase productDeleteUseCase;

    public ProductDeleteController(ProductDeleteUseCase productDeleteUseCase) {
        this.productDeleteUseCase = productDeleteUseCase;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productDeleteUseCase.execute(id);
    }
}
