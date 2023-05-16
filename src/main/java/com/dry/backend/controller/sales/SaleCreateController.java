package com.dry.backend.controller.sales;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.sales.request.SaleCreateRequest;
import com.dry.backend.dto.sales.response.SaleCreateResponse;
import com.dry.backend.usecases.sales.SaleCreateUseCase;
import org.springframework.web.bind.annotation.*;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.SALES)
public class SaleCreateController {

    private final SaleCreateUseCase saleCreateUseCase;

    public SaleCreateController(SaleCreateUseCase saleCreateUseCase) {
        this.saleCreateUseCase = saleCreateUseCase;
    }

    @PostMapping("/create")
    public SaleCreateResponse createSale(@RequestBody SaleCreateRequest request) {

        return saleCreateUseCase.execute(request);
    }
}
