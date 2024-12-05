package com.example.demo1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Product {
    @Id
    int id;
    @Column(name = "name", nullable = false)
    String name;
    @Column
    int stock = 0;
    @Column
    int price;
    @Column
    String description;

}
