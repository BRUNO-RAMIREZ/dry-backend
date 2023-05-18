package com.dry.backend.dto.sales.response;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public class SaleListGetAllResponse {

    private List<SaleResponse> sales;

    public SaleListGetAllResponse() {
    }

    public List<SaleResponse> getSales() {
        return sales;
    }

    public void setSales(List<SaleResponse> sales) {
        this.sales = sales;
    }
}
