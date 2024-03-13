package com.metlife.productcategory.controller;

import com.metlife.productcategory.dto.ProductDto;
import com.metlife.productcategory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;
    @GetMapping
    public ProductDto getAllProduct(@RequestParam(value = "page", required = false,defaultValue = "0") int page,
                                    @RequestParam(value = "size", required = false,defaultValue = "10") int size
                                    ){
        return  productService.getAllProducts(page, size);
    }


}
