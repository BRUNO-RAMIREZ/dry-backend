package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
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
