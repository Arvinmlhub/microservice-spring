package com.metlife.repo;

import com.metlife.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends PagingAndSortingRepository<Order, Long> {
}
