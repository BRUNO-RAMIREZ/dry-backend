package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductDeleteUseCase {
    private ProductDeleteUseCase productDeleteService;

    public ProductDeleteUseCase(ProductDeleteUseCase productDeleteService) {
        this.productDeleteService = productDeleteService;
    }

    public void execute(Long id) {
        return productDeleteService.deleteById(id);
    }
}
