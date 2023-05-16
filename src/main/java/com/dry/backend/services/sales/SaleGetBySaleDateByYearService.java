package com.dry.backend.services.sales;

import com.dry.backend.domain.products.Product;

import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
public interface SaleGetBySaleDateByYearService {

    List<Product> findAllBySaleDate(Integer year);

}
