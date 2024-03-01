package com.training.boot.example.catalog;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Catalog {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> listProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> findProductById(Integer id) {
        return productRepo.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }
}
