package com.kalyani.ecommerce.service;

import com.kalyani.ecommerce.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    void save(Product product);
}
