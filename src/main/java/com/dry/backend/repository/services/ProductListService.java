package com.dry.backend.repository.services;

import com.dry.backend.dto.products.response.ProductListResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductListService {
    public ProductListResponse getProducts() {
        return new ProductListResponse();
    }
}
