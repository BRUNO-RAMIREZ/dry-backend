package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductGetByIdServiceImpl implements ProductGetByIdService{

    private ProductRepository productRepository;

    public ProductGetByIdServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
