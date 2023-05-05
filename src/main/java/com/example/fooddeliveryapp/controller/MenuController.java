package com.example.fooddeliveryapp.controller;

import com.example.fooddeliveryapp.model.Menu;
import com.example.fooddeliveryapp.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")

public class MenuController {
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping
    public Iterable findAll(){
        return menuRepository.findAll();
    }

    @GetMapping("/itemName/{menuitemName}")
    public List findByitemName(@PathVariable String
                               menuitemName){
        return menuRepository.findByitemName(menuitemName);
    }
    @GetMapping("/{itemId}")
    public List findOne(@PathVariable long itemId) {
        return   menuRepository.findAllById(itemId);

    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Menu create(@RequestBody Menu menu){
        return menuRepository.save(menu);
    }
    @DeleteMapping("/{itemId}")
    public void delete(@PathVariable Long itemId) {
        menuRepository.findAllById(itemId);
        menuRepository.deleteByitemId(itemId);
    }

    @PutMapping("/{id}")
    public Menu updateMenu (@RequestBody Menu menu, @PathVariable Long id) throws Exception {
        if (menu.getId() != id) {
            throw new Exception();
        }
        menuRepository.findAllById(id);
        return menuRepository.save(menu);
    }





}
