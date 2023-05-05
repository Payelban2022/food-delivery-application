package com.example.fooddeliveryapp.model;
import javax.persistence.*;

@Entity

public class Order {
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(long serialNo) {
        this.serialNo = serialNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long serialNo;

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Column(nullable = false, unique = true)
    private long orderId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;



    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private String orderDetails;





}
