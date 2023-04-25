package com.example.fooddeliveryapp.model;

import javax.persistence.*;

@Entity
public class Menu {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long itemId;

        @Column(nullable = false, unique = true)
        private String itemName ;

        @Column(nullable = false)
        private String description;

        @Column(nullable = false)
        private int price;
}
