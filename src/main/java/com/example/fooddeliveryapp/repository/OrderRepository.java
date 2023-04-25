package com.example.fooddeliveryapp.repository;

import com.example.fooddeliveryapp.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByorderId(long orderId);
}
