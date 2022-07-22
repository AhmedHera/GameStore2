package com.itakademija.gamestore.controller;

import com.itakademija.gamestore.repository.CartRepository;
import com.itakademija.gamestore.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService, CartRepository cartRepository) {
        this.orderService = orderService;
    }

    @GetMapping("/order-finish")
    public String finishOrder(Model model) {
        model.addAttribute("order", orderService.finishOrder());

        return "order-finish";
    }
}
