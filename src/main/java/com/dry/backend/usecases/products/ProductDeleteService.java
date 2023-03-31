package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductDeleteService {
    private ProductDeleteService productDeleteService;

    public ProductDeleteService(ProductDeleteService productDeleteService) {
        this.productDeleteService = productDeleteService;
    }

    public void execute(Long id) {
        return productDeleteService.deleteById(id);
    }
}
