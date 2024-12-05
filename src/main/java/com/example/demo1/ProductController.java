package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepsitory productRepsitory;

    @GetMapping("/add")
    public Product add() {
        Product product = new Product();
        product.setName("Test");
        productRepsitory.save(product);
        return product;
    }
    @GetMapping("/list")
    public List<Product> getProducts() {
        return productRepsitory.findAll();
    }
}
