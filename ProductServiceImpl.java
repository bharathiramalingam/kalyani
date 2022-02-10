package com.kalyani.ecommerce.service.impl;

import com.kalyani.ecommerce.models.Product;
import com.kalyani.ecommerce.repository.ProductRepository;
import com.kalyani.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
