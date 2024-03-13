package com.metlife.productcategory.service.impl;

import com.metlife.productcategory.dto.ProductDto;
import com.metlife.productcategory.entity.Product;
import com.metlife.productcategory.proxy.OrderProxy;
import com.metlife.productcategory.repo.ProductRepo;
import com.metlife.productcategory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderProxy orderProxy;
    public ProductDto getAllProducts(int page, int size){
        ProductDto productDto=new ProductDto();
        try{
           Page<Product> productPage= productRepo.findAll(PageRequest.of(page,size));
            productDto.setProducts(productPage.getContent());
            productDto.setCount(productPage.getTotalPages());
            productDto.setOrderDto(orderProxy.getAllOrders(0,10));

        }catch (Exception e){
            e.printStackTrace();
        }
        return productDto;
    }
}
