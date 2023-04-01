package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.response.ProductGetByIdResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.products.ProductGetByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/

@Service
public class ProductGetByIdUseCase {
    private ProductGetByIdService productGetByIdService;
    private ProductMapper productMapper;

    public ProductGetByIdUseCase(ProductGetByIdService productGetByIdService, ProductMapper productMapper) {
        this.productGetByIdService = productGetByIdService;
        this.productMapper = productMapper;
    }

    public ProductGetByIdResponse execute(Long id) {
        return productMapper.fromProductToProductGetByIdResponse(productGetByIdService.getById(id));
    }
}
