package com.dry.backend.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dry.backend.domain.products.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bruno Ramirez
 **/
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);

    List<Product> findAllByName(String name);
}
