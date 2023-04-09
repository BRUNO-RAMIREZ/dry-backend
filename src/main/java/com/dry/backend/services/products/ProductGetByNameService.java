package com.dry.backend.services.products;


import com.dry.backend.domain.products.Product;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public interface ProductGetByNameService {
    List<Product> findAllByName(String name);
}
