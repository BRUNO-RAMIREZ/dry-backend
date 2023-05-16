package com.dry.backend.usecases.sales;

import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.dto.sales.request.SaleCreateRequest;
import com.dry.backend.dto.sales.response.SaleCreateResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.sales.SaleGetBySaleDateByDayService;
import com.dry.backend.services.sales.SaleGetBySaleDateByMonthService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleGetBySaleDateByMonthCase {

    private SaleGetBySaleDateByMonthService saleGetBySaleDateBymonthService;

    private ProductMapper productMapper;

    public SaleGetBySaleDateByMonthCase(SaleGetBySaleDateByMonthService saleGetBySaleDateBymonthService,
                                        ProductMapper productMapper) {
        this.saleGetBySaleDateBymonthService = saleGetBySaleDateBymonthService;
        this.productMapper = productMapper;
    }

    public List<ProductCreateResponse> execute(Integer month) {
        return productMapper.fromProductListToProductCreateResponseList(
                saleGetBySaleDateBymonthService.findAllBySaleDate(month)
        );
    }
}
