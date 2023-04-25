package com.example.fooddeliveryapp.repository;

import com.example.fooddeliveryapp.model.Menu;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends
        CrudRepository<Menu , Long> {
    List<Menu> findByitemName(String itemName);
}
