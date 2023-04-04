package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.response.ProductGetAllResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.products.ProductGetAllService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductGetAllUseCase {
    private ProductGetAllService productGetAllService;
    private ProductMapper productMapper;

    public ProductGetAllUseCase(ProductGetAllService productGetAllService, ProductMapper productMapper) {
        this.productGetAllService = productGetAllService;
        this.productMapper = productMapper;
    }

    public ProductGetAllResponse execute() {
        return productMapper.fromProductListToProductGetAllResponse(productGetAllService.getAll());
    }
}
