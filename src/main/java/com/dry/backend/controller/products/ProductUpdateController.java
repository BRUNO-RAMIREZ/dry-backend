package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import org.springframework.web.bind.annotation.*;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.usecases.products.ProductUpdateUseCase;

/**
 * @author Bruno Ramirez
 **/
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductUpdateController {
    private final ProductUpdateUseCase productUpdateUseCase;

    public ProductUpdateController(ProductUpdateUseCase productUpdateUseCase) {
        this.productUpdateUseCase = productUpdateUseCase;
    }

    @PutMapping("/{id}")
    public ProductUpdateResponse updateProduct(@PathVariable Long id,
                                               @RequestBody ProductUpdateRequest productUpdateRequest) {
        return productUpdateUseCase.execute(id, productUpdateRequest);
    }
}
