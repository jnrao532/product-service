package com.coredev.product.repository;

import com.coredev.product.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Harikrishna
 *
 */
public interface ProductRepository extends JpaRepository<Product, String> {

}
