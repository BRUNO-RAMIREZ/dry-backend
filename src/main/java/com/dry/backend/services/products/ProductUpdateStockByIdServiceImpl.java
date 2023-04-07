package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;
import com.dry.backend.repository.products.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductUpdateStockByIdServiceImpl implements ProductUpdateStockByIdService {
    private ProductRepository productRepository;

    public ProductUpdateStockByIdServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void updateStockById(Long id) {
        Product productFound = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productFound.setStock(productFound.getStock() + 1);
        productRepository.save(productFound);
    }
}
