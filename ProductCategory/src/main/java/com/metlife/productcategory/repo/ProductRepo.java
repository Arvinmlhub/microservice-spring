package com.metlife.productcategory.repo;

import com.metlife.productcategory.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {
}
