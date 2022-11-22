package com.example.bask.controller;

import com.example.bask.service.BasketService;
import com.example.bask.sheet.Sheet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id")List<Integer> sheetIds) {
        basketService.add(sheetIds);
    }

    @GetMapping("/get")
    public List<Sheet> get() {
        return basketService.get();
    }
}
