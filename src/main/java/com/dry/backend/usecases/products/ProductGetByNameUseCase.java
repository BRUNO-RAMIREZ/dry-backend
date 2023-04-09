package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.response.ProductGetByNameResponse;
import com.dry.backend.dto.products.response.ProductResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.products.ProductGetByNameService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductGetByNameUseCase {
    private ProductGetByNameService productGetByNameService;
    private ProductMapper productMapper;

    public ProductGetByNameUseCase(ProductGetByNameService productGetByNameService, ProductMapper productMapper) {
        this.productGetByNameService = productGetByNameService;
        this.productMapper = productMapper;
    }

    public ProductGetByNameResponse execute(String name) {
        return productMapper.fromProductListToProductGetByNameResponse(productGetByNameService.findAllByName(name));
    }
}
