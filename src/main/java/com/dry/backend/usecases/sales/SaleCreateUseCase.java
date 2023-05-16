package com.dry.backend.usecases.sales;

import com.dry.backend.domain.sale.Sale;
import com.dry.backend.dto.sales.request.SaleCreateRequest;
import com.dry.backend.dto.sales.response.SaleCreateResponse;
import com.dry.backend.mapper.sales.SaleMapper;
import com.dry.backend.services.sales.SaleCreateService;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleCreateUseCase {

    private SaleCreateService saleCreateService;

    private SaleMapper saleMapper;

    public SaleCreateUseCase(SaleCreateService saleCreateService,
                             SaleMapper saleMapper) {
        this.saleCreateService = saleCreateService;
        this.saleMapper = saleMapper;
    }

    public SaleCreateResponse execute(SaleCreateRequest request) {
        return saleMapper.fromSaleToSaleCreateResponse(
                saleCreateService.save(
                        saleMapper.fromSaleCreateRequestToSale(request)
                )
        );

    }
}
