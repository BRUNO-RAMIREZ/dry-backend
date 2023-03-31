package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.repository.services.ProductUpdateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateUseCase {
    private ProductUpdateService productUpdateService;

    public ProductUpdateUseCase(ProductUpdateService productUpdateService) {
        this.productUpdateService = productUpdateService;
    }

    public ProductUpdateResponse execute(ProductUpdateRequest request) {
        return productUpdateService.update(request);
    }
}
