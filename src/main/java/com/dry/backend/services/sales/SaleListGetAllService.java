package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public interface SaleListGetAllService {

    List<Sale> getAll();
}
