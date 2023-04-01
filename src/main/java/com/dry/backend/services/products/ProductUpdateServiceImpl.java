package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.repository.products.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateServiceImpl implements ProductUpdateService {

    private ProductRepository productRepository;
    private ProductMapper productMapper;
    public ProductUpdateServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    @Override
    public Product update(Long id, Product request) {
        Product productFound = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        return productRepository.save(
                productMapper.fromOldProductToProductUpdate(productFound, request)
        );
    }
}
