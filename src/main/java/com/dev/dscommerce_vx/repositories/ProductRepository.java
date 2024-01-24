package com.dev.dscommerce_vx.repositories;

import com.dev.dscommerce_vx.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
