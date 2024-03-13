package com.metlife.controller;

import com.metlife.dto.OrderDto;
import com.metlife.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public OrderDto getAllOrders(
            @RequestParam(value = "page", required = false,defaultValue = "0") int page,
            @RequestParam(value = "size", required = false,defaultValue = "10") int size

    ){

        return orderService.getAllOrders(page, size);
    }
}
