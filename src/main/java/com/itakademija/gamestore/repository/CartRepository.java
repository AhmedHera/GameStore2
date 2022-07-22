package com.itakademija.gamestore.repository;

import com.itakademija.gamestore.entity.Cart;
import com.itakademija.gamestore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
//    List<Cart> findCartByDeliveryTypeAndTotalPrice(DeliveryType dt, Integer price);
    Cart findCartByUser(User user);
}
