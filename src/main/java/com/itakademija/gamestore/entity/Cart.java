package com.itakademija.gamestore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@NoArgsConstructor
@Transactional
@Data
public class Cart {

    public Cart(User user) {
        this.user = user;
        this.orderEntryList = new ArrayList<>();
        this.totalPrice = new BigDecimal(0);
        this.numberOfItems = 0;
    }

    @Id
    @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "cart_id")
    private Collection<OrderEntry> orderEntryList;

    private DeliveryType deliveryType;
    private BigDecimal totalPrice;
    private Integer numberOfItems;
}
