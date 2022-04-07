package com.coredev.product.controller;

import com.coredev.product.domain.model.Product;
import com.coredev.product.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Harikrishna
 */
@RestController
public class ProductController {

    private final ProductRepository repository;

    ProductController(ProductRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable String id) {
    	return repository.findById(id).get();
    }
    
    @GetMapping("/products")
    List<Product> getAllProducts(){
    	return repository.findAll();
    }

    @PostMapping("/products")
    Product createProduct(@RequestBody Product product) {
    	product.setId(UUID.randomUUID().toString());
    	return repository.save(product);
    }

}
