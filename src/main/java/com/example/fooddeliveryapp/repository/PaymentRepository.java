package com.example.fooddeliveryapp.repository;

import com.example.fooddeliveryapp.model.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
    List<Payment> findBypaymentId(String paymentId);
}
