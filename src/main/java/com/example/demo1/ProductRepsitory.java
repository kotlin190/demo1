package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepsitory extends
        JpaRepository<Product, Integer> {
//    List<Product> findAllByPriceGreaterThanEqual(Integer price);
}
