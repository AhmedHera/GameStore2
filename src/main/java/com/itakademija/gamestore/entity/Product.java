package com.itakademija.gamestore.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    @Column(name="description", length=512)
    private String description;
    private BigDecimal price;
    private Currency currency;
    private Integer quantityInStock;
    private String image;
}
