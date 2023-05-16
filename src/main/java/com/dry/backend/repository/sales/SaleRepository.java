package com.dry.backend.repository.sales;

import com.dry.backend.domain.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Bruno Ramirez
 **/
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    Optional<Sale> findById(Long id);

    List<Sale> findAllBySaleDate(Date saleDate);
}
