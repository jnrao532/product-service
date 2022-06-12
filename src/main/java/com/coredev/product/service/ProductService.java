/**
 * 
 */
package com.coredev.product.service;

import com.coredev.product.domain.model.Product;
import com.coredev.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Harikrishna
 *
 */
@Service
public class ProductService {

    private ProductRepository repository;

    ProductService(ProductRepository repository){
        this.repository = repository;
    }

    public Product fetch(String id){
        return repository.findById(id).get();
    }

    public List<Product> fetchAllProducts(){
        return repository.findAll();
    }

    public Product save(Product product){
        product.setId(UUID.randomUUID().toString());
        return repository.save(product);
    }

    public String delete(String id){
        repository.deleteById(id);
        return id + " is deleted successfully";
    }

}
