package com.dry.backend.usecases.products;

import com.dry.backend.services.products.ProductDeleteService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductDeleteUseCase {
    private ProductDeleteService productDeleteService;

    public ProductDeleteUseCase(ProductDeleteService productDeleteService) {
        this.productDeleteService = productDeleteService;
    }

    public void execute(Long id) {
        productDeleteService.deleteById(id);
    }
}
