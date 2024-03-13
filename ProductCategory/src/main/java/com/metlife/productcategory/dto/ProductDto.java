package com.metlife.productcategory.dto;

import com.metlife.productcategory.entity.Product;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProductDto implements Serializable {
    private List<Product> products;

    private Integer count;

    private OrderDto orderDto;
}
