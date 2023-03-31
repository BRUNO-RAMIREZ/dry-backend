package com.dry.backend.repository.services;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateService {
    public ProductUpdateResponse update(ProductUpdateRequest request) {
        return new ProductUpdateResponse();
    }
}
