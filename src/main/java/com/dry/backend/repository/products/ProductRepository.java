package com.dry.backend.repository.products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dry.backend.domain.products.Product;

import java.util.Optional;

/**
 * @author Bruno Ramirez
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
