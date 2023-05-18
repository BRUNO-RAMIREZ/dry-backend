package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;
import com.dry.backend.mapper.sales.SaleMapper;
import com.dry.backend.repository.clients.ClientRepository;
import com.dry.backend.repository.products.ProductRepository;
import com.dry.backend.repository.sales.SaleRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleUpdateByIdServiceImpl implements SaleUpdateByIdService {

    private SaleRepository saleRepository;

    private ProductRepository productRepository;

    private ClientRepository clientRepository;
    private SaleMapper saleMapper;

    public SaleUpdateByIdServiceImpl(SaleRepository saleRepository, SaleMapper saleMapper, ProductRepository productRepository, ClientRepository clientRepository) {
        this.saleRepository = saleRepository;
        this.saleMapper = saleMapper;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public Sale update(Long id, Sale request) {
        Sale saleFound = saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Sale not found"));
        saleFound = saleMapper.fromOldSaleToSaleUpdate(saleFound, request);

        clientRepository.save(saleFound.getClient());
        saleFound.getProducts().forEach(product -> productRepository.save(product));
        saleFound = saleRepository.save(saleFound);
        return saleFound;
    }

}
