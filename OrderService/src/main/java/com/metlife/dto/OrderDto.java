package com.metlife.dto;

import com.metlife.entity.Order;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private List<Order> orders;

    private Integer count;
}
