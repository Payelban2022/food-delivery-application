package com.example.fooddeliveryapp.model;
import javax.persistence.*;

@Entity


public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long serialNo;

    @Column(nullable = false, unique = true)
    private long orderId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String paymentId;

    @Column(nullable = false)
    private double amount;
}
