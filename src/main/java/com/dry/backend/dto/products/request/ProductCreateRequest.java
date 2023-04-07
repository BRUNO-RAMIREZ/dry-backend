package com.dry.backend.dto.products.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
@Data
public class ProductCreateRequest {
    private String name;
    private String description;
    private String image;
    private Double purchasePrice;
    private Double salePrice;
    private Double stock;

    public ProductCreateRequest() {
    }
}
