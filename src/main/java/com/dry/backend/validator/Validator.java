package com.dry.backend.validator;

import com.dry.backend.domain.products.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Bruno Ramirez
 **/

@Service
public class Validator {
    private List<Map<String, String>> errors;

    public Validator() {
    }
    public boolean validate(Product instanceToValidate) {
        errors = new ArrayList<>();
        if (instanceToValidate.getName() == null || instanceToValidate.getName().isEmpty()) {
            errors.add(Map.of("name", "Name is required"));
        }
        if (instanceToValidate.getDescription() == null || instanceToValidate.getDescription().isEmpty()) {
            errors.add(Map.of("description", "Description is required"));
        }
        if (instanceToValidate.getImage() == null || instanceToValidate.getImage().isEmpty()) {
            errors.add(Map.of("image", "Image is required"));
        }
        if (instanceToValidate.getPurchasePrice() == null || instanceToValidate.getPurchasePrice() < 0) {
            errors.add(Map.of("purchasePrice", "Purchase price is required"));
        }
        if (instanceToValidate.getSalePrice() == null || instanceToValidate.getSalePrice() < 0) {
            errors.add(Map.of("salePrice", "Sale price is required"));
        }
        if (instanceToValidate.getStock() == null || instanceToValidate.getStock() < 0) {
            errors.add(Map.of("stock", "Stock is required"));
        }
        return errors.isEmpty();
    }

}
