package com.itakademija.gamestore.entity;

import lombok.Getter;

@Getter
public enum DeliveryType {
    SHIPPING("shipping"),
    IN_STORE("inStore");

    private final String name;

     DeliveryType(String name) {
        this.name = name;
    }
}
