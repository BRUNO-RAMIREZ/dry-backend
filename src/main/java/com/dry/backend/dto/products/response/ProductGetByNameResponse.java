package com.dry.backend.dto.products.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
public class ProductGetByNameResponse {
    private List<ProductResponse> products;

    public ProductGetByNameResponse() {
    }
}
