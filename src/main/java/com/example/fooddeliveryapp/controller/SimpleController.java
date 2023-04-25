package com.example.fooddeliveryapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @GetMapping("/menu")
    public String menuPage() {
//        TODO write code get resturant tables return all restureant
        return "Menu";
    }
    @GetMapping("/restaurant")
    public String restaurant(){
//        TODO write code get restaurant tables return all restaurant
        return "restaurant list";
    }
    @GetMapping("/order/{orderId}")
    public String order(@PathVariable int orderId){
//        TODO need write code to find order details with order id
        return "here is my oder details list";
    }
    @GetMapping("/payment/{paymentID}")
    public double payment(@PathVariable int paymentID){
//        TODO need write code to find order details with order id
        return 1.0;
    }

}

