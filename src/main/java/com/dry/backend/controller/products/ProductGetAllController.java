package com.dry.backend.controller.products;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.products.response.ProductGetAllResponse;
import com.dry.backend.usecases.products.ProductGetAllUseCase;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.PRODUCTS)
public class ProductGetAllController {
    private final ProductGetAllUseCase productGetAllUseCase;

    public ProductGetAllController(ProductGetAllUseCase productGetAllUseCase) {
        this.productGetAllUseCase = productGetAllUseCase;
    }

    @GetMapping("/getAll")
    public ProductGetAllResponse getAll() {
        return productGetAllUseCase.execute();
    }
}
