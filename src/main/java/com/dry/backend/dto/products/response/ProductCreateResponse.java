package com.dry.backend.dto.products.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Lob;

/**
 * @author Bruno Ramirez
 **/
@Getter
@Setter
@Data
public class ProductCreateResponse {
    private Long id;
    private String name;
    private String description;
    @Lob
    private String image;
    private Double purchasePrice;
    private Double salePrice;
    private Double stock;
    public ProductCreateResponse() {
    }
}
