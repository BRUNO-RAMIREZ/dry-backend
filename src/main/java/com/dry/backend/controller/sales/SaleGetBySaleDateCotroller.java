package com.dry.backend.controller.sales;

import com.dry.backend.constant.Constants;
import com.dry.backend.dto.products.response.ProductCreateResponse;
import com.dry.backend.usecases.sales.SaleGetBySaleDateByDayCase;
import com.dry.backend.usecases.sales.SaleGetBySaleDateByMonthCase;
import com.dry.backend.usecases.sales.SaleGetBySaleDateByYearCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@CrossOrigin
@RestController
@RequestMapping(Constants.BasePath.SALES)
public class SaleGetBySaleDateCotroller {

    private final SaleGetBySaleDateByDayCase saleGetBySaleDateCase;
    private final SaleGetBySaleDateByMonthCase saleGetBySaleDateByMonthCase;
    private final SaleGetBySaleDateByYearCase saleGetBySaleDateByYearCase;

    public SaleGetBySaleDateCotroller(SaleGetBySaleDateByDayCase saleGetBySaleDateCase, SaleGetBySaleDateByMonthCase saleGetBySaleDateByMonthCase, SaleGetBySaleDateByYearCase saleGetBySaleDateByYearCase) {
        this.saleGetBySaleDateCase = saleGetBySaleDateCase;
        this.saleGetBySaleDateByMonthCase = saleGetBySaleDateByMonthCase;
        this.saleGetBySaleDateByYearCase = saleGetBySaleDateByYearCase;
    }

    @GetMapping("/getBySaleDate/{day}/day")
    public List<ProductCreateResponse> getSalesByDay(@PathVariable("day") Integer day) {

        return saleGetBySaleDateCase.execute(day);
    }

    @GetMapping("/getBySaleDate/{month}/month")
    public List<ProductCreateResponse> getSalesByMonth(@PathVariable("month") Integer month) {

        return saleGetBySaleDateByMonthCase.execute(month);
    }

    @GetMapping("/getBySaleDate/{year}/year")
    public List<ProductCreateResponse> getSalesByYear(@PathVariable("year") Integer year) {

        return saleGetBySaleDateByYearCase.execute(year);
    }
}
