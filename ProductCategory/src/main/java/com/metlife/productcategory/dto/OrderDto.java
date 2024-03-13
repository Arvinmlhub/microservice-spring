package com.metlife.productcategory.dto;

import com.metlife.productcategory.entity.Order;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private List<Order> orders;

    private Integer count;
}
