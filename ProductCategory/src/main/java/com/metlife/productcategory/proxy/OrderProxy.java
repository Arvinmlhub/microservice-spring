package com.metlife.productcategory.proxy;

import com.metlife.productcategory.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient( name = "Order-Service", url = "http://localhost:2020/")
public interface OrderProxy {
    @GetMapping("/order")
    public OrderDto getAllOrders(
            @RequestParam(value = "page", required = false,defaultValue = "0") int page,
            @RequestParam(value = "size", required = false,defaultValue = "10") int size

    );
}
