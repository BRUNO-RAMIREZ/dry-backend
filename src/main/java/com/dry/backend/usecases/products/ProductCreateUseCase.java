package com.dry.backend.usecases.products;

import org.springframework.stereotype.Service;

import com.dry.backend.services.products.ProductCreateService;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.validator.Validator;
import com.dry.backend.domain.products.Product;
import com.dry.backend.dto.products.request.ProductCreateRequest;
import com.dry.backend.dto.products.response.ProductCreateResponse;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateUseCase {
    private ProductCreateService productCreateService;
    private ProductMapper productMapper;
    private Validator validator;
    public ProductCreateUseCase(ProductCreateService productCreateService,
                                ProductMapper productMapper,
                                Validator validator) {
        this.productCreateService = productCreateService;
        this.productMapper = productMapper;
        this.validator = validator;
    }

    public ProductCreateResponse execute(ProductCreateRequest request) {
        Product product = productMapper.fromProductCreateRequestToProduct(request);
        if (validator.validate(product)) {
            return productMapper.fromProductToProductCreateResponse(
                    productCreateService.save(
                            productMapper.fromProductCreateRequestToProduct(request)
                    )
            );
        }
        return null;
    }
}
