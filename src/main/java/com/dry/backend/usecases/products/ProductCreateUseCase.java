package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.services.products.ProductCreateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateUseCase {
    private ProductCreateService productCreateService;

    public ProductCreateUseCase(ProductCreateService productCreateService) {
        this.productCreateService = productCreateService;
    }

    public ProductCreateResponse execute(ProductCreateRequest request) {
        return productCreateService.save(request);
    }
}
