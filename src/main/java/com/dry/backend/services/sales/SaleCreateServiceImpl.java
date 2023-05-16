package com.dry.backend.services.sales;

import com.dry.backend.domain.sale.Sale;
import com.dry.backend.repository.clients.ClientRepository;
import com.dry.backend.repository.products.ProductRepository;
import com.dry.backend.repository.sales.SaleRepository;
import org.springframework.stereotype.Service;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleCreateServiceImpl implements SaleCreateService {

    private SaleRepository saleRepository;

    private ProductRepository productRepository;

    private ClientRepository clientRepository;

    public SaleCreateServiceImpl(SaleRepository saleRepository, ProductRepository productRepository, ClientRepository clientRepository) {
        this.saleRepository = saleRepository;
        this.productRepository = productRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public Sale save(Sale sale) {
        clientRepository.save(sale.getClient());
        sale.getProducts().forEach(product -> productRepository.save(product));
        return saleRepository.save(sale);
    }
}
