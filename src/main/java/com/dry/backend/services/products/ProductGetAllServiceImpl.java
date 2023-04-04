package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductGetAllServiceImpl implements ProductGetAllService{
    private ProductRepository productRepository;

    public ProductGetAllServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
