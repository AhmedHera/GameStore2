package com.itakademija.gamestore.service;

import com.itakademija.gamestore.entity.Order;
import com.itakademija.gamestore.entity.OrderEntry;
import com.itakademija.gamestore.repository.CartRepository;
import com.itakademija.gamestore.repository.OrderEntryRepository;
import com.itakademija.gamestore.repository.OrderRepository;
import com.itakademija.gamestore.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final UserRepository userRepository;
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;
    private final OrderEntryRepository orderEntryRepository;

    public OrderService(
            UserRepository userRepository,
            CartRepository cartRepository,
            OrderRepository orderRepository,
            OrderEntryRepository orderEntryRepository
    ) {
        this.userRepository = userRepository;
        this.cartRepository = cartRepository;
        this.orderRepository = orderRepository;
        this.orderEntryRepository = orderEntryRepository;
    }

    public Order finishOrder(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        var user = userRepository.findByUsername(currentUserName);

        var cart = user.getCart();

        var order = new Order();
        var finishedOrderEnteries = cart.getOrderEntryList().stream().map(oE -> {
            var orderEntry = new OrderEntry();
            orderEntry.setQuantity(oE.getQuantity());
            orderEntry.setProduct(oE.getProduct());

            return orderEntry;
        }).collect(Collectors.toList());
        order.setOrderEntryList(finishedOrderEnteries);
        order.setTotalPrice(cart.getTotalPrice());
        order.setNumberOfItems(cart.getNumberOfItems());
        order.setUser(cart.getUser());
        order.setInvoice(getInoiveNumber());
        orderRepository.save(order);
        cart.getOrderEntryList().forEach(orderEntryRepository::delete);
        cartRepository.delete(cart);

        return order;
    }

    public static String getInoiveNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return String.format("%06d", number);
    }
}
