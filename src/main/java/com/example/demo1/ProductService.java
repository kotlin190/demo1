package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepsitory productRepository;

    public Product addProduct() {
        Product product = new Product();
        product.setName("Test");
        return productRepository.save(product);
    }
}
