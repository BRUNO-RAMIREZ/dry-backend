package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;

/**
 * @author Bruno Ramirez
 **/
public interface ProductUpdateService {
    Product update(Long id, Product product);
}
