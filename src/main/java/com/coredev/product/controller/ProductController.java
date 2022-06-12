package com.coredev.product.controller;

import com.coredev.product.domain.model.Product;

import java.util.List;

import com.coredev.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Harikrishna
 */
@RestController
public class ProductController {

    private final ProductService service;

    ProductController(ProductService service) {
        this.service = service;
    }
    
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable String id) {
    	return service.fetch(id);
    }
    
    @GetMapping("/products")
    List<Product> getAllProducts(){
    	return service.fetchAllProducts();
    }

    @PostMapping("/products")
    Product createProduct(@RequestBody Product product) {
    	return service.save(product);
    }

    @DeleteMapping("/products/{id}")
    String deleteProduct(@PathVariable String id){
        return service.delete(id);

    }

}
