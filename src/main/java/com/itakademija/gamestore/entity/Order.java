package com.itakademija.gamestore.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "shop_orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderEntry> orderEntryList;
    private DeliveryType deliveryType;
    private BigDecimal totalPrice;
    private Integer numberOfItems;
    private String invoice;
}
