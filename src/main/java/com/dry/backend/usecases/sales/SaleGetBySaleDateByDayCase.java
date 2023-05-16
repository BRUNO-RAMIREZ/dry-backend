package com.dry.backend.usecases.sales;

import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.sales.SaleGetBySaleDateByDayService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleGetBySaleDateByDayCase {

    private SaleGetBySaleDateByDayService saleGetBySaleDateByDayService;

    private ProductMapper productMapper;

    public SaleGetBySaleDateByDayCase(SaleGetBySaleDateByDayService saleGetBySaleDateByDayService,
                                      ProductMapper productMapper) {
        this.saleGetBySaleDateByDayService = saleGetBySaleDateByDayService;
        this.productMapper = productMapper;
    }

    public List<ProductCreateResponse> execute(Integer day) {
        return productMapper.fromProductListToProductCreateResponseList(
                saleGetBySaleDateByDayService.findAllBySaleDate(day)
        );
    }
}
