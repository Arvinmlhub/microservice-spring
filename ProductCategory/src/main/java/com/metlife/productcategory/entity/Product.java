package com.metlife.productcategory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    private Long productId;

    private String description;

    private Double price;


}
