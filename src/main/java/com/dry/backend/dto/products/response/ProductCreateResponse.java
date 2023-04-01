package com.dry.backend.dto.products.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
public class ProductCreateResponse {
    private Long id;
    private String name;
    private String description;
    private String image;
    private Double purchasePrice;
    private Double salePrice;
    private Double stock;
    public ProductCreateResponse() {
    }
}
