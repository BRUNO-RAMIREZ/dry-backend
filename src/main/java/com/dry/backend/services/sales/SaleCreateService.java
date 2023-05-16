package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;

/**
 * @author Bruno Ramirez
 **/
public interface SaleCreateService {

    Sale save(Sale sale);
}
