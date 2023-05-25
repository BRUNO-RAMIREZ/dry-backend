package com.dry.backend.services.sales;

import com.dry.backend.domain.products.Product;
import com.dry.backend.domain.sale.Sale;
import com.dry.backend.repository.products.ProductRepository;
import com.dry.backend.repository.sales.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bruno Ramirez
 **/
@Service
public class SaleCancelServiceImpl implements SaleCancelService {

    private final SaleRepository saleRepository;
    private final ProductRepository productRepository;

    public SaleCancelServiceImpl(SaleRepository saleRepository, ProductRepository productRepository) {
        this.saleRepository = saleRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void cancelSale(Long id) {
        Sale saleFound = saleRepository.findById(id).orElseThrow(() -> new RuntimeException("Sale not found"));
        List<Product> products = saleFound.getProducts();
        List<Integer> quantityStockOfProductsSaled = saleFound.getQuantityStockOfProductsSaled();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            Integer quantityStockOfProductSaled = quantityStockOfProductsSaled.get(i);
            product.setStock(product.getStock() + quantityStockOfProductSaled);
            this.productRepository.save(product);
        }
        saleFound.setState(false);
        this.saleRepository.save(saleFound);
    }
}
