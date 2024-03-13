package com.metlife.productcategory.service;

import com.metlife.productcategory.dto.ProductDto;
import com.metlife.productcategory.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {


    ProductDto getAllProducts(int page , int size);

}
