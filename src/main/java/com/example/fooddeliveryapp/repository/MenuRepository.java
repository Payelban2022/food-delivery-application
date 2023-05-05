package com.example.fooddeliveryapp.repository;

import com.example.fooddeliveryapp.model.Menu;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends
        CrudRepository<Menu , Long> {


     List<Menu> findAllById(Long id);

    List<Menu> findByitemName(String itemName);

    void deleteByitemId(Long id);
}
