package com.dry.backend.repository.services;

import com.dry.backend.dto.products.response.ProductGetByIdResponse;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductGetByIdService {
    public ProductGetByIdResponse getById(Long id) {
        return new ProductGetByIdResponse();
    }
}
