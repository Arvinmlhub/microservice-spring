package com.metlife.productcategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProductCategoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCategoryApplication.class, args);
    }

}
