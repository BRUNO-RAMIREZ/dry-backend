package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateService {
    private ProductCreateService productCreateService;

    public ProductCreateService(ProductCreateService productCreateService) {
        this.productCreateService = productCreateService;
    }

    public ProductCreateResponse execute(ProductCreateRequest request) {
        return productCreateService.save(request);
    }
}
