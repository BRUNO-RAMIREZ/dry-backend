package com.dry.backend.controller.products;

import org.springframework.web.bind.annotation.*;

import com.dry.backend.constant.Constants;
import com.dry.backend.usecases.products.ProductUpdateStockByIdUseCase;

/**
 * @author Bruno Ramirez
 **/

@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductUpdateStockByIdController {
    private final ProductUpdateStockByIdUseCase productUpdateStockByIdUseCase;

    public ProductUpdateStockByIdController(ProductUpdateStockByIdUseCase productUpdateStockByIdUseCase) {
        this.productUpdateStockByIdUseCase = productUpdateStockByIdUseCase;
    }

    @PutMapping("/{id}/updateStock")
    public void updateStockProductById(@PathVariable Long id) {
        productUpdateStockByIdUseCase.execute(id);
    }
}
