package com.example.demo1;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
