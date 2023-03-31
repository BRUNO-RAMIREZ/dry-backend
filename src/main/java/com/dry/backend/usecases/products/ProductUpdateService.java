package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateService {
    private ProductUpdateService productUpdateService;

    public ProductUpdateService(ProductUpdateService productUpdateService) {
        this.productUpdateService = productUpdateService;
    }

    public ProductUpdateResponse execute(ProductUpdateRequest request) {
        return productUpdateService.update(request);
    }
}
