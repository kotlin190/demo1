package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/add")
    public Product add() {
        return productService.addProduct();
    }
    @GetMapping("/product")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        Optional<Product> optional = productService.getProductById(id);
        return optional.get();
    }
}
