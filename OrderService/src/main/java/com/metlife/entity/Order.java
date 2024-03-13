package com.metlife.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "product_order")
public class Order {
    @Id
    private Integer orderId;

    private LocalDateTime orderDate=LocalDateTime.now();

    private Double totalPrice;


}
