package com.dry.backend.usecases.products;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.products.ProductUpdateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateUseCase {
    private ProductUpdateService productUpdateService;
    private ProductMapper productMapper;

    public ProductUpdateUseCase(ProductUpdateService productUpdateService, ProductMapper productMapper) {
        this.productUpdateService = productUpdateService;
        this.productMapper = productMapper;
    }

    public ProductUpdateResponse execute(Long id, ProductUpdateRequest request) {

        return productMapper.fromProductToProductUpdateResponse(
                productUpdateService.update(id, productMapper.fromProductUpdateRequestToProduct(request))
        );
    }
}
