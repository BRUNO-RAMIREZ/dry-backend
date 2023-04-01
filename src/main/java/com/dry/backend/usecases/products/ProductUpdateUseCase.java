package com.dry.backend.usecases.products;

import com.dry.backend.domain.products.Product;
import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.ProductUpdateResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.products.ProductUpdateService;
import com.dry.backend.validator.Validator;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateUseCase {
    private ProductUpdateService productUpdateService;
    private ProductMapper productMapper;
    private Validator validator;

    public ProductUpdateUseCase(ProductUpdateService productUpdateService,
                                ProductMapper productMapper,
                                Validator validator) {
        this.productUpdateService = productUpdateService;
        this.productMapper = productMapper;
        this.validator = validator;
    }

    public ProductUpdateResponse execute(Long id, ProductUpdateRequest request) {
        Product product = productMapper.fromProductUpdateRequestToProduct(request);
        if (validator.validate(product)) {
            return productMapper.fromProductToProductUpdateResponse(
                    productUpdateService.update(id, productMapper.fromProductUpdateRequestToProduct(request))
            );
        }
        return null;
    }
}
