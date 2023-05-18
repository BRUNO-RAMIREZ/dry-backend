package com.dry.backend.controller.sales;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.sales.response.SaleListGetAllResponse;
import com.dry.backend.usecases.sales.SaleListGetAllUseCase;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.SALES)
public class SaleGetAllController {

    private final SaleListGetAllUseCase saleListGetAllUseCase;

    public SaleGetAllController(SaleListGetAllUseCase saleListGetAll) {
        this.saleListGetAllUseCase = saleListGetAll;

    }

    @GetMapping("/getAllSales")
    public SaleListGetAllResponse getAllSalesList() {
        return saleListGetAllUseCase.execute();
    }
}
