package com.dry.backend.services.products;

import org.springframework.stereotype.Service;
import java.util.List;

import com.dry.backend.domain.products.Product;

/**
 * @author Bruno Ramirez
 **/
@Service

public class ProductListServiceImpl implements ProductListService{
    @Override
    public List<Product> getAllProducts(String name) {
        return null;
    }
}
