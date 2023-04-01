package com.dry.backend.services.products;

import com.dry.backend.domain.products.Product;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public interface ProductListService {

    List<Product> getAllProducts(String name);
}
