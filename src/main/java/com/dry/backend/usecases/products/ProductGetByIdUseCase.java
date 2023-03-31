package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/

@Service
public class ProductGetByIdUseCase {
    private ProductGetByIdService productGetByIdService;

    public ProductGetByIdUseCase(ProductGetByIdService productGetByIdService) {
        this.productGetByIdService = productGetByIdService;
    }

    public ProductGetByIdResponse execute(Long id) {
        return productGetByIdService.getById(id);
    }
}
