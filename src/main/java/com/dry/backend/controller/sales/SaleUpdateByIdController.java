package com.dry.backend.controller.sales;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.sales.request.SaleUpdateByIdRequest;
import com.dry.backend.dto.sales.response.SaleUpdateByIdResponse;
import com.dry.backend.usecases.sales.SaleUpdateByIdUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.SALES)
public class SaleUpdateByIdController {

    private final SaleUpdateByIdUseCase saleUpdateByIdUseCase;

    public SaleUpdateByIdController(SaleUpdateByIdUseCase saleUpdateByIdUseCase) {
        this.saleUpdateByIdUseCase = saleUpdateByIdUseCase;
    }

    @PutMapping("/{id}")
    public SaleUpdateByIdResponse updateSale(@PathVariable Long id,
                                             @RequestBody SaleUpdateByIdRequest request) {
        return saleUpdateByIdUseCase.execute(id, request);
    }
}
