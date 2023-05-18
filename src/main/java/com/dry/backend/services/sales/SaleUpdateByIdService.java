package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;

/**
 * @author Bruno Ramirez
 **/
public interface SaleUpdateByIdService {

    Sale update(Long id, Sale sale);
}
