package com.metlife.service.impl;

import com.metlife.dto.OrderDto;
import com.metlife.entity.Order;
import com.metlife.repo.OrderRepo;
import com.metlife.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public OrderDto getAllOrders(int page, int size){
        OrderDto orderDto=new OrderDto();
        try {
            Page<Order> orders= orderRepo.findAll(PageRequest.of(page, size));
            orderDto.setOrders(orders.getContent());
            orderDto.setCount(orders.getTotalPages());

        }catch (Exception e){

        }
        return orderDto;
    }
}
