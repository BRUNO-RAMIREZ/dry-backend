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
public class SaleGetBySaleDateByMonthServiceImpl implements SaleGetBySaleDateByMonthService{

    private SaleRepository saleRepository;

    public SaleGetBySaleDateByMonthServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Product> findAllBySaleDate(Integer month) {
        Date saleDateByMonth = new Date();
        saleDateByMonth.setMonth(month);
        List<Sale> sales = saleRepository.findAllBySaleDate(saleDateByMonth);
        List<Product> products = new ArrayList<>();
        sales.stream().forEach(sale -> products.addAll(sale.getProducts()));
        return products;
    }
}
