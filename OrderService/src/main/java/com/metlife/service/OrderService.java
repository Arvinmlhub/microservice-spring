package com.metlife.service;

import com.metlife.dto.OrderDto;

public interface OrderService {

    public OrderDto getAllOrders(int page, int size);
}
