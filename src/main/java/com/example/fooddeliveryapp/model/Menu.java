package com.example.fooddeliveryapp.model;

import javax.persistence.*;

@Entity

public class Menu {


        public String getItemName() {
                return itemName;
        }

        public void setItemName(String itemName) {
                this.itemName = itemName;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @Column
        private long itemId;


        @Column(nullable = false, unique = true)
        private String itemName ;

        @Column(nullable = false)
        private String description;

        @Column(nullable = false)
        private int price;
}
