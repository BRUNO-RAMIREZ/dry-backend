package com.dry.backend.usecases.sales;

import com.dry.backend.dto.sales.response.SaleListGetAllResponse;
import com.dry.backend.mapper.sales.SaleMapper;
import com.dry.backend.services.sales.SaleListGetAllService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleListGetAllUseCase {

    private SaleListGetAllService saleListGetAllService;

    private SaleMapper saleMapper;

    public SaleListGetAllUseCase(SaleListGetAllService saleListGetAllService, SaleMapper saleMapper) {
        this.saleListGetAllService = saleListGetAllService;
        this.saleMapper = saleMapper;
    }

    public SaleListGetAllResponse execute() {
        return saleMapper.fromSaleListToSaleListGetAllResponse(saleListGetAllService.getAll());
    }
}
