package com.dry.backend.usecases.products;

import com.dry.backend.mapper.products.ProductMapper;
import org.springframework.stereotype.Service;

import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.services.products.ProductCreateService;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateUseCase {
    private ProductCreateService productCreateService;
    private ProductMapper productMapper;
    public ProductCreateUseCase(ProductCreateService productCreateService, ProductMapper productMapper) {
        this.productCreateService = productCreateService;
        this.productMapper = productMapper;
    }

    public ProductCreateResponse execute(ProductCreateRequest request) {
        return productMapper.fromProductToProductCreateResponse(
                productCreateService.save(
                        productMapper.fromProductCreateRequestToProduct(request)
                )
        );
    }
}
