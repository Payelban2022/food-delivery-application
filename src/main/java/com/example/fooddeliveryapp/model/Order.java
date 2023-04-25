package com.example.fooddeliveryapp.model;
import javax.persistence.*;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long serialNo;

    @Column(nullable = false, unique = true)
    private long orderId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String orderDetails;



}
