package com.dry.backend.services.products;

import org.springframework.stereotype.Service;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;

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
