package com.dry.backend.dto.products.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
public class ProductGetAllResponse {
    private List<ProductResponse> products;

    public ProductGetAllResponse() {
    }
}
