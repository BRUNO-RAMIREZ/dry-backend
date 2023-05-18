package com.dry.backend.usecases.sales;

import com.dry.backend.dto.sales.request.SaleUpdateByIdRequest;
import com.dry.backend.dto.sales.response.SaleUpdateByIdResponse;
import com.dry.backend.mapper.sales.SaleMapper;
import com.dry.backend.services.sales.SaleUpdateByIdService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleUpdateByIdUseCase {

    private SaleUpdateByIdService saleUpdateByIdService;
    private SaleMapper saleMapper;

    public SaleUpdateByIdUseCase(SaleUpdateByIdService saleUpdateByIdService,
                                 SaleMapper saleMapper) {
        this.saleUpdateByIdService = saleUpdateByIdService;
        this.saleMapper = saleMapper;
    }

    public SaleUpdateByIdResponse execute(Long id, SaleUpdateByIdRequest request) {
        return saleMapper.fromSaleToSaleUpdateByIdResponse(
                saleUpdateByIdService.update(id, saleMapper.fromSaleUpdateByIdRequestToSale(request)));
    }
}
