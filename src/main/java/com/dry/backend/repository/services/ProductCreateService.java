package com.dry.backend.repository.services;

import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.entity.products.product;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateService {
    public ProductCreateResponse save(ProductCreateRequest request) {
        return new ProductCreateResponse();
    }
}
