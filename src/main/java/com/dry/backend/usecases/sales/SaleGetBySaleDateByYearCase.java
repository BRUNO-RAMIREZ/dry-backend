package com.dry.backend.usecases.sales;

import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.mapper.products.ProductMapper;
import com.dry.backend.services.sales.SaleGetBySaleDateByDayService;
import com.dry.backend.services.sales.SaleGetBySaleDateByYearService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleGetBySaleDateByYearCase {

    private SaleGetBySaleDateByYearService saleGetBySaleDateByYearservice;

    private ProductMapper productMapper;

    public SaleGetBySaleDateByYearCase(SaleGetBySaleDateByYearService saleGetBySaleDateByYearservice,
                                      ProductMapper productMapper) {
        this.saleGetBySaleDateByYearservice = saleGetBySaleDateByYearservice;
        this.productMapper = productMapper;
    }

    public List<ProductCreateResponse> execute(Integer day) {
        return productMapper.fromProductListToProductCreateResponseList(
                saleGetBySaleDateByYearservice.findAllBySaleDate(day)
        );
    }
}
