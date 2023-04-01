package com.dry.backend.services.products;


import com.dry.backend.domain.products.Product;

/**
 * @author Bruno Ramirez
 **/
public interface ProductCreateService {

    Product save(Product product);

}
