package com.ecom.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecom.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
