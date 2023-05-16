package com.dry.backend.services.sales;

import com.dry.backend.domain.products.Product;
import com.dry.backend.domain.sale.Sale;
import com.dry.backend.repository.sales.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleGetBySaleDateByDayServiceImpl implements SaleGetBySaleDateByDayService {

    private SaleRepository saleRepository;

    public SaleGetBySaleDateByDayServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Product> findAllBySaleDate(Integer day) {
        Date saleDateByDay = new Date();
        saleDateByDay.setDate(day);
        List<Sale> sales = saleRepository.findAllBySaleDate(saleDateByDay);
        List<Product> products = new ArrayList<>();
        sales.stream().forEach(sale -> products.addAll(sale.getProducts()));
        return products;
    }
}
