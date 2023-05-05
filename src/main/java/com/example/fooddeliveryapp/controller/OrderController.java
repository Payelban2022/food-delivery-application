package com.example.fooddeliveryapp.controller;

import com.example.fooddeliveryapp.model.Menu;
import com.example.fooddeliveryapp.model.Order;
import com.example.fooddeliveryapp.repository.MenuRepository;
import com.example.fooddeliveryapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")

public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public Iterable findAll() {
        return orderRepository.findAll();
    }

    @GetMapping("/customerName/{ordercustomerName}")
    public List findBycustomerName(@PathVariable String
                                           ordercustomerName) {
        return orderRepository.findBycustomerName(ordercustomerName);
    }

    @GetMapping("/{orderId}")
    public List findOne(@PathVariable long orderId) {
        return orderRepository.findAllById(orderId);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @DeleteMapping("/{orderId}")
    public void delete(@PathVariable Long orderId) {
        orderRepository.findAllById(orderId);
        orderRepository.deleteByorderId(orderId);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@RequestBody Order order, @PathVariable Long id) throws Exception {
        if (order.getId() != id) {
            throw new Exception();
        }
        orderRepository.findAllById(id);
        return orderRepository.save(order);

    }
}







