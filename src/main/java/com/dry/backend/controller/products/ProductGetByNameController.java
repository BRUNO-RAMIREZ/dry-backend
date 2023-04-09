package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.products.response.ProductGetByNameResponse;
import com.dry.backend.usecases.products.ProductGetByNameUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductGetByNameController {
    private final ProductGetByNameUseCase productGetByNameUseCase;

    public ProductGetByNameController(ProductGetByNameUseCase productGetByNameUseCase) {
        this.productGetByNameUseCase = productGetByNameUseCase;
    }

    @GetMapping("/{name}") 
    public ProductGetByNameResponse getByName(@PathVariable String name) {
        return productGetByNameUseCase.execute(name);
    }
}
