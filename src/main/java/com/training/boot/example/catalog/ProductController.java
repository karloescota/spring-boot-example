package com.training.boot.example.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private Catalog catalog;

    @GetMapping
    List<Product> listProducts() {
        return catalog.listProducts();
    }

    @GetMapping("/{id}")
    Optional<Product> getProduct(@PathVariable Integer id) {
        return catalog.findProductById(id);
    }

    @PostMapping
    Product createProduct(@RequestBody Product product) {
        return catalog.createProduct(product);
    }

    // @PutMapping("/{id}")
    // Product updateProduct(@RequestBody Product product, @PathVariable Integer id)
    // {
    // return catalog.updateProduct(id, product);
    // }

    // @DeleteMapping("/{id}")
    // void deleteProduct(@PathVariable Integer id) {
    // catalog.deleteProductById(id);
    // }
}
