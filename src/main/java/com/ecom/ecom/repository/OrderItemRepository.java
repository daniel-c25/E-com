package com.ecom.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecom.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
