package com.dry.backend.services.products;

import org.springframework.stereotype.Service;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductCreateServiceImpl implements ProductCreateService{

    private ProductRepository productRepository;

    public ProductCreateServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
