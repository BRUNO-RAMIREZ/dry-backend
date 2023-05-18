package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;
import com.dry.backend.repository.sales.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleListGetAllServiceImpl implements SaleListGetAllService {

    private final SaleRepository saleRepository;

    public SaleListGetAllServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Sale> getAll() {
        return saleRepository.findAll();
    }
}
