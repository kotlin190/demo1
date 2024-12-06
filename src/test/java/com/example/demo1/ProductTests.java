package com.example.demo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class ProductTests {
    @Autowired
    ProductRepsitory productRepsitory;
    @Autowired
    ProductService productService;
    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testInsertRightProduct() {
        Product product = new Product("Test");
        Product insertedProduct = productRepsitory.save(product);
        Product found = entityManager.find(
                Product.class, insertedProduct.getId());
        Assertions.assertEquals(insertedProduct, found);
    }

    public void testGetAllProducts() {
        Product product1 = new Product("Test1");
        Product product2 = new Product("Test2");
//        productService.
    }
}
