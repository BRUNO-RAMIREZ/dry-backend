package com.dry.backend.usecases.products;

import com.dry.backend.services.products.ProductUpdateStockByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateStockByIdUseCase {
    private ProductUpdateStockByIdService productUpdateStockByIdService;

    public ProductUpdateStockByIdUseCase(ProductUpdateStockByIdService productUpdateStockByIdService) {
        this.productUpdateStockByIdService = productUpdateStockByIdService;
    }

    public void execute(Long id) {
        productUpdateStockByIdService.updateStockById(id);
    }
}
