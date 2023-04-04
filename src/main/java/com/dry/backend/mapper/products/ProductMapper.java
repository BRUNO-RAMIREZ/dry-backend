package com.dry.backend.mapper.products;

import com.dry.backend.dto.products.request.ProductUpdateRequest;
import com.dry.backend.dto.products.response.*;
import com.dry.backend.usecases.products.ProductUpdateUseCase;
import org.springframework.stereotype.Service;

import com.dry.backend.domain.products.Product;
import com.dry.backend.dto.products.request.ProductCreateRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class ProductMapper {

    public ProductCreateResponse fromProductToProductCreateResponse(Product product) {
        ProductCreateResponse response = new ProductCreateResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setImage(product.getImage());
        response.setPurchasePrice(product.getPurchasePrice());
        response.setSalePrice(product.getSalePrice());
        response.setStock(product.getStock());
        return response;
    }

    public Product fromProductCreateRequestToProduct(ProductCreateRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setImage(request.getImage());
        product.setPurchasePrice(request.getPurchasePrice());
        product.setSalePrice(request.getSalePrice());
        product.setStock(request.getStock());
        return product;
    }

    public ProductGetByIdResponse fromProductToProductGetByIdResponse(Product product) {
        ProductGetByIdResponse response = new ProductGetByIdResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setImage(product.getImage());
        response.setPurchasePrice(product.getPurchasePrice());
        response.setSalePrice(product.getSalePrice());
        response.setStock(product.getStock());
        return response;
    }

    public Product fromOldProductToProductUpdate(Product oldProduct, Product newProduct) {
        oldProduct.setName(newProduct.getName());
        oldProduct.setDescription(newProduct.getDescription());
        oldProduct.setImage(newProduct.getImage());
        oldProduct.setPurchasePrice(newProduct.getPurchasePrice());
        oldProduct.setSalePrice(newProduct.getSalePrice());
        oldProduct.setStock(newProduct.getStock());
        return oldProduct;
    }

    public Product fromProductUpdateRequestToProduct(ProductUpdateRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setImage(request.getImage());
        product.setPurchasePrice(request.getPurchasePrice());
        product.setSalePrice(request.getSalePrice());
        product.setStock(request.getStock());
        return product;
    }

    public ProductUpdateResponse fromProductToProductUpdateResponse(Product product) {
        ProductUpdateResponse response = new ProductUpdateResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setImage(product.getImage());
        response.setPurchasePrice(product.getPurchasePrice());
        response.setSalePrice(product.getSalePrice());
        response.setStock(product.getStock());
        return response;
    }

    public ProductResponse fromProductToProductResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setImage(product.getImage());
        response.setPurchasePrice(product.getPurchasePrice());
        response.setSalePrice(product.getSalePrice());
        response.setStock(product.getStock());
        return response;
    }

    public ProductGetAllResponse fromProductListToProductGetAllResponse(List<Product> products) {
        ProductGetAllResponse response = new ProductGetAllResponse();
        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product product : products) {
            productResponses.add(fromProductToProductResponse(product));
        }
        response.setProducts(productResponses);
        return response;
    }
}
