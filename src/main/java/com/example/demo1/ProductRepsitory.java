package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepsitory extends
        JpaRepository<Product, Integer> {
}
