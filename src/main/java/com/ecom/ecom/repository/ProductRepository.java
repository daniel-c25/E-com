package com.ecom.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ecom.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long	>{

}
