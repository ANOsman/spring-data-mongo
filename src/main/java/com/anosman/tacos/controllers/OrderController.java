package com.anosman.tacos.controllers;

import com.anosman.tacos.TacoOrder;
import com.anosman.tacos.repositories.TacoOrderRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    private TacoOrderRepository orderRepository;

    public OrderController(TacoOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder order, Errors errors, SessionStatus status) {
        log.info("Order submitted: {}", order);
        if(errors.hasErrors()) {
            log.info("Something went wrong");
            log.info("order received: {}", order);
            return "orderForm";
        }
        orderRepository.save(order);
        status.setComplete();
        return "redirect:/";
    }

    @GetMapping("/all")
    public String getAllOrders() {
        List<TacoOrder> orders = (List<TacoOrder>) orderRepository.findAll();
        return "redirect:/";
    }
}
